package _02_generics._08_customListSorter.models;

import _02_generics._08_customListSorter.interfaces.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 21.07.2016.
 */
public class CustomListImpl<T extends Comparable<T>> implements CustomList<T> {
    private List<T> elements;

    public CustomListImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public T remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(elements, firstIndex, secondIndex);
    }

    @Override
    public int countGreaterThat(T element) {
        int count = 0;
        for (T t : elements) {
            if(t.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public T getMax() {
        return this.elements.stream()
                .max(new Comparator<T>() {
                    @Override
                    public int compare(T o1, T o2) {
                        return o1.compareTo(o2);
                    }
                }).get();
    }

    @Override
    public T getMin() {
        T minElement = this.elements.get(0);
        for (int i = 1; i < this.elements.size(); i++) {
            if(this.elements.get(i).compareTo(minElement) < 0){
                minElement = this.elements.get(i);
            }
        }
        return minElement;
    }

    @Override
    public int getSize() {
        return this.elements.size();
    }

    @Override
    public T get(int index) {
        return this.elements.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T element : elements) {
            sb.append(element)
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
