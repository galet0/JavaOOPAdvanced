package _01_interfaces._07_foodShortage.models;

/**
 * Created by User on 17.07.2016.
 */
public class Rebel extends Inhabitant {

    private String group;
    private int food;

    public Rebel(String name, int age,String group) {
        super(name, age);
        this.group = group;
        this.food = 0;
    }

    @Override
    public int buyFood() {
        return this.food = 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
