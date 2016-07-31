package pr0304Barracks.core.commands;

/**
 * Created by User on 31.07.2016.
 */
public class FightCommand extends Command {
    public FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
