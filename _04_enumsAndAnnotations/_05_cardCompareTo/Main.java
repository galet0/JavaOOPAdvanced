package _04_enumsAndAnnotations._05_cardCompareTo;

import _04_enumsAndAnnotations._05_cardCompareTo.enums.RankPower;
import _04_enumsAndAnnotations._05_cardCompareTo.enums.SuitPower;
import _04_enumsAndAnnotations._05_cardCompareTo.interfaces.Card;
import _04_enumsAndAnnotations._05_cardCompareTo.models.CardImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Card firstCard = createCard(scan);
        Card secondCard = createCard(scan);

        int maxCard = firstCard.compareTo(secondCard);
        if(maxCard == 1 || maxCard == 0){
            System.out.println(firstCard.toString());
        } else if (maxCard == -1){
            System.out.println(secondCard.toString());
        }

    }

    public static Card createCard (Scanner scan){
        String rankPowerF = scan.nextLine();
        RankPower rankPower = RankPower.valueOf(rankPowerF);

        String suitPowerF = scan.nextLine();
        SuitPower suitPower = SuitPower.valueOf(suitPowerF);

        Card card = new CardImpl(rankPower,suitPower);
        return card;
    }
}
