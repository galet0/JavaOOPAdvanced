package _01_interfaces._07_foodShortage.models;

import _01_interfaces._07_foodShortage.interfaces.Buyer;

public class Inhabitant implements Buyer{
    private String name;
    private int age;
    private int food;

    public Inhabitant(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.food = 0;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name == null || name.length() == 0){
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }


    @Override
    public int buyFood() {
        return this.food;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
