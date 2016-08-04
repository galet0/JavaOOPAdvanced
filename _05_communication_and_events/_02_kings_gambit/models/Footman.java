package _05_communication_and_events._02_kings_gambit.models;

import _05_communication_and_events._02_kings_gambit.interfaces.King;

/**
 * Created by User on 02.08.2016.
 */
public class Footman extends UnitImpl {
    private static final int DEFAULT_HEALTH = 2;

    public Footman(String name, King king) {
        super(name, king);
        this.setHealthPoints(DEFAULT_HEALTH);
    }

    @Override
    public void handleRespondToAttack() {
        System.out.printf("Footman %s is panicking!\n", this.getName());
    }
}
