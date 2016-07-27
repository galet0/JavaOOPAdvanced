package _04_enumsAndAnnotations._05_cardCompareTo.models;

import _04_enumsAndAnnotations._05_cardCompareTo.enums.RankPower;
import _04_enumsAndAnnotations._05_cardCompareTo.enums.SuitPower;
import _04_enumsAndAnnotations._05_cardCompareTo.interfaces.Card;

/**
 * Created by User on 27.07.2016.
 */
public class CardImpl implements Card, Comparable<Card> {
    private RankPower rank;
    private SuitPower suit;

    public CardImpl(RankPower rank, SuitPower suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.getRank(), this.getSuit(), this.getTotalPower());
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getTotalPower(), o.getTotalPower());
    }

    @Override
    public RankPower getRank() {
        return this.rank;
    }

    @Override
    public SuitPower getSuit() {
        return this.suit;
    }

    @Override
    public int getTotalPower() {
        return this.rank.getPower() + this.suit.getPower();
    }
}
