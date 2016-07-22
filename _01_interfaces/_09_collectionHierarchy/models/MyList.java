package _01_interfaces._09_collectionHierarchy.models;

import _01_interfaces._09_collectionHierarchy.interfaces.Sizeable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 19.07.2016.
 */
public class MyList implements Sizeable {

    private LinkedList<String> myList;

    public MyList() {

        this.myList = new LinkedList<>();
    }


    @Override
    public Integer used() {

        return this.myList.size();
    }

    @Override
    public List<String> remove(int index) {

        List<String> result = new ArrayList<>();
        int removeElements = this.myList.size() > index ? index : this.myList.size();
        for (int i = 0; i < removeElements; i++) {

            result.add(this.myList.removeFirst());

        }
        return result;
    }

    @Override
    public int add(String element) {

        this.myList.addFirst(element);
        return this.myList.size() - this.myList.size();
    }

}