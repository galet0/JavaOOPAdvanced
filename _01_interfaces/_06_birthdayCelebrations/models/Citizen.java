package _01_interfaces._06_birthdayCelebrations.models;

import _01_interfaces._06_birthdayCelebrations.interfaces.Birthable;

/**
 * Created by User on 17.07.2016.
 */
public class Citizen extends Population implements Birthable {

    private int age;
    private String id;
    private String birthday;

    public Citizen(String name, int age, String id, String birthday) {
        super(name);
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

//    @Override
//    public String getBirthday() {
//        return this.birthday;
//    }

    @Override
    public void printBirthday(String date) {
        if(this.birthday.endsWith(date)){
            System.out.println(this.birthday);
        }
    }
}
