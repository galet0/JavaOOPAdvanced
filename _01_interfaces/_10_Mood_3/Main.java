package _01_interfaces._10_Mood_3;

import _01_interfaces._10_Mood_3.interfaces.GameObject;
import _01_interfaces._10_Mood_3.models.ArchangelImpl;
import _01_interfaces._10_Mood_3.models.DemonImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 06.08.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[\\s\\|]+");

        String username = input[0];
        String characterType = input[1];

        GameObject gameObject = null;
        switch (characterType){
            case "Demon":
                double energyDemon = Double.parseDouble(input[2]);
                int levelDemon = Integer.parseInt(input[3]);
                gameObject = new DemonImpl(username, levelDemon, energyDemon);
                break;
            case "Archangel":
                int energyArchangel = Integer.parseInt(input[2]);
                int levelArchangel = Integer.parseInt(input[3]);
                gameObject = new ArchangelImpl(username, levelArchangel, energyArchangel);
                break;
        }

        if(gameObject != null){
            System.out.println(gameObject.toString());
        }

    }
}
