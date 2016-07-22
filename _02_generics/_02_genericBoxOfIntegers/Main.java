package _02_generics._02_genericBoxOfIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 20.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(reader.readLine());
            GenericBox<Integer> box = new GenericBox<>(input);
            System.out.println(box.toString());
        }
    }
}
