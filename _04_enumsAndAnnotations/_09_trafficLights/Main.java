package _04_enumsAndAnnotations._09_trafficLights;

import _04_enumsAndAnnotations._09_trafficLights.enums.Light;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 27.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] light = reader.readLine().split("\\s+");
        Light[] lights = new Light[light.length];

        for (int i = 0; i < lights.length; i++) {
            lights[i] = Light.valueOf(light[i]);
        }

        int repeats = Integer.parseInt(reader.readLine());
        for (int i = 0; i < repeats; i++) {
            for (int j = 0; j < lights.length; j++) {
                lights[j] = lights[j].next();
                System.out.print(lights[j] + " ");
            }
            System.out.println();
        }
    }
}
