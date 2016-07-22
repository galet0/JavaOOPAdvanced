package _01_interfaces._05_borderControl;

import _01_interfaces._05_borderControl.interfaces.Migratable;
import _01_interfaces._05_borderControl.models.Citizens;
import _01_interfaces._05_borderControl.models.Robots;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 17.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Citizens citizens = null;
        Robots robots = null;
        ArrayList<Migratable> ids = new ArrayList<>();

        while (true){
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }
            if(input.length == 3){
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String id = input[2];
                citizens = new Citizens(name, age, id);
                ids.add(citizens);
            } else {
                String name = input[0];
                String id = input[1];
                robots = new Robots(name, id);
                ids.add(robots);
            }

        }

        String input = reader.readLine();
        for (Migratable id : ids) {
            id.detained(input);
        }

    }
}
