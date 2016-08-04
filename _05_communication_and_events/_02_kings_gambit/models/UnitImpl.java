package _05_communication_and_events._02_kings_gambit.models;

import _05_communication_and_events._02_kings_gambit.interfaces.King;
import _05_communication_and_events._02_kings_gambit.interfaces.Unit;

/**
 * Created by User on 02.08.2016.
 */
public abstract class UnitImpl implements Unit {
    private String name;
    private int helthPoints;
    private King king;

    public UnitImpl(String name, King king) {
        this.setName(name);
        this.setKing(king);
    }

    private void setName(String name) {
        this.name = name;
    }

    public King getKing() {
        return this.king;
    }

    private void setKing(King king) {
        this.king = king;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void handleKill() {
        this.setHealthPoints(this.getHealthPoints() - 1);
        if(this.getHealthPoints() == 0){
            this.king.removeDeadUnit(this.getName());
        }
    }

    protected void setHealthPoints(int healthPoints){
        this.helthPoints = healthPoints;
    }

    public int getHealthPoints(){
        return this.helthPoints;
    }
}
