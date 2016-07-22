package _01_interfaces._04_telephony;

import java.util.Scanner;

/**
 * Created by User on 16.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split("\\s+");
        String[] urls = scan.nextLine().split("\\s+");

        for (String number : numbers) {
            System.out.println(smartphone.call(number));
        }

        for (String url : urls) {
            System.out.println(smartphone.browse(url));
        }

    }
}
