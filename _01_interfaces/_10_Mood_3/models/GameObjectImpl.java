package _01_interfaces._10_Mood_3.models;

import _01_interfaces._10_Mood_3.interfaces.GameObject;

/**
 * Created by User on 06.08.2016.
 */
public  abstract class GameObjectImpl implements GameObject {
    private String username;
    private String hashedPassword;
    private int level;
    private String specialPointsType;

    public GameObjectImpl(String username, int level, String type) {
        this.username = username;
        this.level = level;
        this.specialPointsType = type;
        this.hashedPassword = this.generateHashedPassword(this.username);
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public abstract String generateHashedPassword(String username);

    @Override
    public String getSpecialPointsType() {
        return this.specialPointsType;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s", this.getUsername(), this.hashedPassword, this.getSpecialPointsType());
    }
}
