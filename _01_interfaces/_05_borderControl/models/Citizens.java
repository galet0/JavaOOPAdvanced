package _01_interfaces._05_borderControl.models;

import _01_interfaces._05_borderControl.interfaces.Migratable;

/**
 * Created by User on 17.07.2016.
 */
public class Citizens implements Migratable{
    private String name;
    private int age;
    private String id;

    public Citizens(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void detained(String fakeId) {
        if(this.id.endsWith(fakeId)){
            System.out.println(this.id);
        }
    }
}
