package _02_generics._08_customListSorter.interfaces;

/**
 * Created by User on 21.07.2016.
 */
public interface CustomList<T extends Comparable<T>> {
    void add(T element);
    T remove(int index);
    boolean contains(T element);
    void swap(int firstIndex, int secondIndex);
    int countGreaterThat(T element);
    T getMax();
    T getMin();
    int getSize();
    T get(int index);
}
