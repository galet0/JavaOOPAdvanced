package _02_generics._03_genericSwapMethodStrings.interfaces;

/**
 * Created by User on 20.07.2016.
 */
public interface Swapable<T> {
    void add(T element);

    void swap(int firstIndex, int secondIndex);
}
