package _01_interfaces._06_birthdayCelebrations;

import _01_interfaces._06_birthdayCelebrations.interfaces.Birthable;
import _01_interfaces._06_birthdayCelebrations.models.Citizen;
import _01_interfaces._06_birthdayCelebrations.models.Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 17.07.2016.
 */
public class Main {
    public static String[] input;
    public static ArrayList<Birthable> borns;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        borns = new ArrayList<>();

        while (true){
            input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }
            registration();
        }
        String date = reader.readLine();
        for (Birthable born : borns) {
            born.printBirthday(date);
        }
    }

    public static void registration(){
        String inhabitant = input[0];

        switch (inhabitant){
            case "Citizen":
                String name = input[1];
                int age = Integer.parseInt(input[2]);
                String id = input[3];
                String birthday = input[4];
                Citizen citizen = new Citizen(name, age, id, birthday);
                borns.add(citizen);
                break;
            case "Pet":
                String namePet = input[1];
                String birthdayPet = input[2];
                Pet pet = new Pet(namePet, birthdayPet);
                borns.add(pet);
                break;
        }
    }
}
