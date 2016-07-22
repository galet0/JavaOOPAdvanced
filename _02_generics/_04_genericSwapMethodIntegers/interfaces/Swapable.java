package _02_generics._04_genericSwapMethodIntegers.interfaces;

/**
 * Created by User on 21.07.2016.
 */
public interface Swapable<T> {
    void swap(int firstIndex, int secondIndex);

    void addElements(T element);
}
