package _02_generics._06_genericsCountMethodDouble;


import _02_generics._06_genericsCountMethodDouble.models.GenericsCount;

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
        GenericsCount<Double> str = new GenericsCount<>();
        ArrayList<Double> arrayStr = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            Double input = Double.parseDouble(reader.readLine());
            arrayStr.add(input);
        }

        Double element = Double.parseDouble(reader.readLine());
        System.out.println(str.countGreater(arrayStr, element));
    }
}
