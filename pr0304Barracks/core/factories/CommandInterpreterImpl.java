package pr0304Barracks.core.factories;

import pr0304Barracks.annotations.Inject;
import pr0304Barracks.contracts.CommandInterpreter;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by User on 31.07.2016.
 */
public class CommandInterpreterImpl implements CommandInterpreter {
    private static final String COMMANDS_PACKAGE = "pr0304Barracks.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        Character firstChar = commandName.toUpperCase().charAt(0);
        String path = COMMANDS_PACKAGE + firstChar + commandName.substring(1) + "Command";
        Executable executable = null;

        try {
            Class exeClass = Class.forName(path);
            Constructor ctor = exeClass.getConstructor(String[].class);
            executable = (Executable) ctor.newInstance((Object) data);
            this.injectDependancies(executable, exeClass);

        } catch (ReflectiveOperationException ex){
            ex.printStackTrace();
        }
        return executable;
    }

    private void injectDependancies(Executable executable, Class exeClass) throws IllegalAccessException {
        Field[] executableFields = exeClass.getDeclaredFields();
        Field[] theseFields = CommandInterpreterImpl.class.getDeclaredFields();

        for (Field executableField : executableFields) {
            if(!executableField.isAnnotationPresent(Inject.class)){
                continue;
            }

            executableField.setAccessible(true);
            for (Field theseField : theseFields) {
                if(!theseField.getType().equals(executableField.getType())){
                    continue;
                }

                theseField.setAccessible(true);
                executableField.set(executable, theseField.get(this));
            }
        }
    }
}
