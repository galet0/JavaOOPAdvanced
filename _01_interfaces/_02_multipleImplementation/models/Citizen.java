package _01_interfaces._02_multipleImplementation.models;

import _01_interfaces._02_multipleImplementation.interfaces.Birthable;
import _01_interfaces._02_multipleImplementation.interfaces.Identifiable;
import _01_interfaces._02_multipleImplementation.interfaces.Person;

/**
 * Created by User on 16.07.2016.
 */
public class Citizen implements Person, Birthable, Identifiable {

    private String name;
    private int age;
    private String birthDate;
    private String id;

    public Citizen(String name, int age, String birthDay, String id) {
        this.setName(name);
        this.setAge(age);
        this.setBirthDate(birthDay);
        this.setId(id);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(String birthDay) {
        this.birthDate = birthDay;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }
}
