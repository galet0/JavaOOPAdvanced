package _02_generics._03_genericSwapMethodStrings;

import _02_generics._03_genericSwapMethodStrings.models.GenericsSwap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 20.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        GenericsSwap<String> genSwap = new GenericsSwap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            genSwap.add(input);
        }

        String[] indexes = reader.readLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);

        genSwap.swap(firstIndex, secondIndex);

        System.out.println(genSwap.toString());
    }
}
