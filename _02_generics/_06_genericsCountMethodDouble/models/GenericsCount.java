package _02_generics._06_genericsCountMethodDouble.models;

import _02_generics._06_genericsCountMethodDouble.interfaces.ComparableElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 21.07.2016.
 */
public class GenericsCount<T extends Comparable<T>> implements ComparableElements<T> {
    private List<T> elements;

    public GenericsCount() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public int countGreater(List<T> elements, T element) {
        int count = 0;
        for (T t : elements) {
            if(t.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }
}
