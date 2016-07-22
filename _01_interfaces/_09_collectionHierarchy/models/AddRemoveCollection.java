package _01_interfaces._09_collectionHierarchy.models;

import _01_interfaces._09_collectionHierarchy.interfaces.Removeable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by User on 19.07.2016.
 */
public class AddRemoveCollection implements Removeable {
    private LinkedList<String> myList;

    public AddRemoveCollection() {
        this.myList = new LinkedList<>();
    }



    @Override
    public int add(String element) {

        this.myList.addFirst(element);
        return this.myList.size() - this.myList.size();
    }

    @Override
    public List<String> remove(int index) {
        List<String> result = new ArrayList<>();
        int removeElements = this.myList.size() > index ? index : this.myList.size();
        for (int i = 0; i < removeElements; i++) {

            result.add(this.myList.removeLast());

        }
        return result;
    }

}
