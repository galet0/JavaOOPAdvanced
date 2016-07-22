package _02_generics._04_genericSwapMethodIntegers;

import _02_generics._04_genericSwapMethodIntegers.models.GenericsSwap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 21.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        GenericsSwap<Integer> box = new GenericsSwap<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            Integer input = Integer.parseInt(reader.readLine());
            box.addElements(input);
        }

        String[] indexes = reader.readLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);

        box.swap(firstIndex,secondIndex);
        System.out.println(box.toString());
    }
}
