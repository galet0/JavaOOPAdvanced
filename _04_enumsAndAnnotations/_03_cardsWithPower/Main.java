package _04_enumsAndAnnotations._03_cardsWithPower;

import _04_enumsAndAnnotations._03_cardsWithPower.enums.RankPower;
import _04_enumsAndAnnotations._03_cardsWithPower.enums.SuitPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 27.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rankPower = reader.readLine();
        String suitPower = reader.readLine();
        int totalPower = RankPower.valueOf(rankPower).getPower() + SuitPower.valueOf(suitPower).getPower();
        System.out.printf("CardImpl name: %s of %s; CardImpl power: %d",rankPower, suitPower, totalPower);
    }
}
