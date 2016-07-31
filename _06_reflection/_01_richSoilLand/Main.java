package _06_reflection._01_richSoilLand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Class<RichSoilLand> soilLand = RichSoilLand.class;

        try {
            while (true) {
                String commandName = reader.readLine();
                RichSoilLand richSoilLand = soilLand.newInstance();

                if (commandName.equals("HARVEST")) {
                    break;
                }

                Field[] fields = soilLand.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    int modifier = field.getModifiers();
                    String modifierToString = Modifier.toString(modifier);
                    String type = field.getType().getSimpleName();
                    String name = field.getName();
                    if (commandName.equals(modifierToString)) {
                        System.out.println(modifierToString + " " + type + " " + name);
                    } else if(commandName.equals("all")){
                        System.out.println(modifierToString + " " + type + " " + name);
                    }
                }
            }
        } catch (ReflectiveOperationException roe) {
            roe.printStackTrace();
        }
    }
}
