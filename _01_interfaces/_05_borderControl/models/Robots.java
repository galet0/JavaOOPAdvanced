package _01_interfaces._05_borderControl.models;

import _01_interfaces._05_borderControl.interfaces.Migratable;

/**
 * Created by User on 17.07.2016.
 */
public class Robots implements Migratable{
    private String name;
    private String id;

    public Robots(String name, String id) {
        this.name = name;
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
