package _02_generics._09_customListIterator.interfaces;

public interface Sorter<T extends Comparable<T>> {
    void sort(CustomList<T> elements);
}
