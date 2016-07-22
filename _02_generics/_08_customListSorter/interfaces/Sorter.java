package _02_generics._08_customListSorter.interfaces;

/**
 * Created by User on 21.07.2016.
 */
public interface Sorter<T extends Comparable<T>> {
    void sort(CustomList<T> elements);
}
