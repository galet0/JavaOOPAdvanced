package _01_interfaces._10_Mood_3.models;

import _01_interfaces._10_Mood_3.interfaces.Archangel;

/**
 * Created by User on 06.08.2016.
 */
public class ArchangelImpl extends GameObjectImpl implements Archangel {
    private int mana;

    public ArchangelImpl(String username, int level, int mana) {
        super(username, level, "Archangel");
        this.mana = mana;
    }

    @Override
    public int getMana() {
        return this.mana;
    }

    @Override
    public String generateHashedPassword(String username) {
        return new StringBuilder().append(this.getUsername()).reverse().append(this.getUsername().length() * 21).toString();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s",super.toString(), this.getMana() * this.getLevel());
    }
}
