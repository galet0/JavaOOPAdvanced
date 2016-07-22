package _01_interfaces._07_foodShortage;

import _01_interfaces._07_foodShortage.models.Citizen;
import _01_interfaces._07_foodShortage.models.Inhabitant;
import _01_interfaces._07_foodShortage.models.Rebel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 17.07.2016.
 */
public class Main {
    public static String[] input;
    public static ArrayList<Inhabitant> buyers;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        buyers = new ArrayList<>();
        int numberOfPeople = Integer.parseInt(reader.readLine());
        int totalFood = 0;

        for (int i = 0; i < numberOfPeople; i++) {
            input = reader.readLine().split("\\s+");
            tryMakeInhabitant();
        }
        String buyer = "";

        while (true){
            buyer = reader.readLine();
            if(buyer.equals("End")){
                break;
            }

            for (Inhabitant inhabitant : buyers) {
                if(inhabitant.getName().equals(buyer)){
                    totalFood += inhabitant.buyFood();
                }
            }
        }

        System.out.println(totalFood);
    }

    public static void tryMakeInhabitant(){
        if(input.length == 4){
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            String id = input[2];
            String birthday = input[3];
            Citizen citizen = new Citizen(name, age, id, birthday);
            buyers.add(citizen);

        } else if(input.length == 3){
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            String group = input[2];
            Rebel rebel = new Rebel(name, age, group);
            buyers.add(rebel);
        }


    }
}
