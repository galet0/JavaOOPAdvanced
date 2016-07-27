package _04_enumsAndAnnotations._05_cardCompareTo.interfaces;

import _04_enumsAndAnnotations._05_cardCompareTo.enums.RankPower;
import _04_enumsAndAnnotations._05_cardCompareTo.enums.SuitPower;
import _04_enumsAndAnnotations._05_cardCompareTo.models.CardImpl;

/**
 * Created by User on 27.07.2016.
 */
public interface Card extends Comparable<Card> {
    RankPower getRank();
    SuitPower getSuit();
    int getTotalPower();
}
