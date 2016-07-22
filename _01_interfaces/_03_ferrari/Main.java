package _01_interfaces._03_ferrari;

import _01_interfaces._03_ferrari.interfaces.Car;
import _01_interfaces._03_ferrari.models.Ferrari;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

/**
 * Created by User on 16.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalClassFormatException {
        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }

        Scanner scan = new Scanner(System.in);
        String driverName = scan.nextLine();

        Car ferrari = new Ferrari(driverName);
        System.out.println(ferrari);

    }
}
