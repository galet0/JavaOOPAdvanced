package _01_interfaces._09_collectionHierarchy.models;

import _01_interfaces._09_collectionHierarchy.interfaces.Addable;

import java.util.LinkedList;

/**
 * Created by User on 19.07.2016.
 */
public class AddCollection implements Addable {
    private LinkedList<String> myList;

    public AddCollection() {
        this.myList = new LinkedList<>();
    }



    @Override
    public int add(String element) {

        this.myList.addLast(element);
        return this.myList.size() - 1;
    }

}