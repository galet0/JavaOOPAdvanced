package _06_reflection._02_blackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by User on 30.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class<BlackBoxInt> boxClass = BlackBoxInt.class;
        try {
            Constructor ctor = boxClass.getDeclaredConstructor();
            ctor.setAccessible(true);
            BlackBoxInt blackBoxInt = (BlackBoxInt) ctor.newInstance();

            while (true){
                String[] input = reader.readLine().split("_");
                String commandName = input[0];
                if(commandName.equals("END")){
                    break;
                }
                int value = Integer.parseInt(input[1]);
                Method method = boxClass.getDeclaredMethod(commandName, int.class);
                method.setAccessible(true);
                method.invoke(blackBoxInt, value);
                Field field = boxClass.getDeclaredField("innerValue");
                field.setAccessible(true);
                System.out.println(field.get(blackBoxInt));
            }

        } catch (ReflectiveOperationException roe) {
            roe.printStackTrace();
        }
    }

}
