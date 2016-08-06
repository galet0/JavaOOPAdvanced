package _01_interfaces._10_Mood_3.models;

import _01_interfaces._10_Mood_3.interfaces.Demon;

/**
 * Created by User on 06.08.2016.
 */
public class DemonImpl extends GameObjectImpl implements Demon {
    private double energy;


    public DemonImpl(String username, int level, double energy) {
        super(username, level, "Demon");
        this.energy = energy;
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public String generateHashedPassword(String username) {
        return String.format("%d", this.getUsername().length() * 217);
    }

    @Override
    public String toString() {
        return String.format("%s%n%s", super.toString(), this.getEnergy() * this.getLevel());
    }
}
