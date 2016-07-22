package _02_generics._05_genericCountMethodString.interfaces;

import java.util.List;

/**
 * Created by User on 21.07.2016.
 */
public interface ComparableElements<T extends Comparable<T>>{
    int countGreater(List<T> elements, T element);
    void add(T element);
}
