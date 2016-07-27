package _04_enumsAndAnnotations._04_cardToString.models;

import _04_enumsAndAnnotations._04_cardToString.enums.RankPower;
import _04_enumsAndAnnotations._04_cardToString.enums.SuitPower;

/**
 * Created by User on 27.07.2016.
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    private int getTotalPower(){
        int totalPower = 0;
        return totalPower = RankPower.valueOf(this.getRank()).getPower() +
                            SuitPower.valueOf(this.getSuit()).getPower();
    }
    @Override
    public String toString() {
        return String.format("CardImpl name: %s of %s; CardImpl power: %d", this.getRank(), this.getSuit(), this.getTotalPower());
    }
}
