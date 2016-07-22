package _01_interfaces._07_foodShortage.models;

/**
 * Created by User on 17.07.2016.
 */
public class Citizen extends Inhabitant {

    private String id;
    private String birthday;
    private int food;

    public Citizen(String name, int age, String id, String birthday) {
        super(name, age);
        this.id = id;
        this.birthday = birthday;
        this.food = 0;
    }

    @Override
    public int buyFood() {
        return this.food = 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
