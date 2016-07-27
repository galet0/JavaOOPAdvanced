package _04_enumsAndAnnotations._05_cardCompareTo.enums;

/**
 * Created by User on 27.07.2016.
 */
public enum SuitPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    SuitPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
