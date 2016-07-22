package _01_interfaces._06_birthdayCelebrations.models;

import _01_interfaces._06_birthdayCelebrations.interfaces.Birthable;

/**
 * Created by User on 17.07.2016.
 */
public class Pet extends Population implements Birthable{

    private String birthday;

    public Pet(String name, String birthday) {
        super(name);
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
