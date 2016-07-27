package _04_enumsAndAnnotations._01_cardSuit;

import _04_enumsAndAnnotations._01_cardSuit.enums.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumSet;

/**
 * Created by User on 26.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        CardSuit cardSuit = null;
        System.out.println("CardImpl Suits:");
        for (CardSuit card : EnumSet.allOf(CardSuit.class)) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
        }

    }
}
