package _02_generics._10_tuples;

import _02_generics._10_tuples.interfaces.Tuple;
import _02_generics._10_tuples.models.TupleImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 21.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] personsInfo = reader.readLine().split("\\s+");
        String names = personsInfo[0] + " " + personsInfo[1];
        String address = personsInfo[2];
        Tuple<String, String> persons = new TupleImpl<>(names, address);

        String[] drinkBeers = reader.readLine().split("\\s+");
        String name = drinkBeers[0];
        Integer count = Integer.parseInt(drinkBeers[1]);
        Tuple<String, Integer> beers = new TupleImpl<>(name, count);

        drinkBeers = reader.readLine().split("\\s+");
        Integer aInteger = Integer.parseInt(drinkBeers[0]);
        Double aDouble = Double.parseDouble(drinkBeers[1]);
        Tuple<Integer, Double> nums = new TupleImpl<>(aInteger, aDouble);

        System.out.println(persons.toString());
        System.out.println(beers.toString());
        System.out.println(nums.toString());
    }
}
