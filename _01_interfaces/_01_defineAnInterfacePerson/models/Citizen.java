package _01_interfaces._01_defineAnInterfacePerson.models;

import _01_interfaces._01_defineAnInterfacePerson.interfaces.Person;

/**
 * Created by User on 16.07.2016.
 */
public class Citizen implements Person {

    private String name;

    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

}
