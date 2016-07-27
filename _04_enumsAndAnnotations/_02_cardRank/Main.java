package _04_enumsAndAnnotations._02_cardRank;

import _04_enumsAndAnnotations._02_cardRank.enums.CardRank;

/**
 * Created by User on 26.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        String input = "CardImpl Ranks";
        System.out.println("CardImpl Ranks:");
        for (CardRank cardRank : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }

    }
}
