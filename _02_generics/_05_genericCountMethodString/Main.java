package _02_generics._05_genericCountMethodString;

import _02_generics._05_genericCountMethodString.models.GenericsCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 21.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GenericsCount<String> str = new GenericsCount<>();
        ArrayList<String> arrayStr = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            arrayStr.add(input);
        }

        String element = reader.readLine();
        System.out.println(str.countGreater(arrayStr, element));

    }
}
