package _04_enumsAndAnnotations._04_cardToString;

import _04_enumsAndAnnotations._04_cardToString.models.Card;

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
        Card card = new Card(rankPower, suitPower);
        System.out.println(card);
    }
}
