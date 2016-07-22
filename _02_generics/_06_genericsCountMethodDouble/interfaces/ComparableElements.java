package _02_generics._06_genericsCountMethodDouble.interfaces;

import java.util.List;

/**
 * Created by User on 21.07.2016.
 */
public interface ComparableElements<T extends Comparable<T>> {
    void add(T element);
    int countGreater(List<T> elements, T element);
}
