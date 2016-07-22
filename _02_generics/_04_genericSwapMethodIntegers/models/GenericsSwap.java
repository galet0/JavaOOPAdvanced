package _02_generics._04_genericSwapMethodIntegers.models;

import _02_generics._04_genericSwapMethodIntegers.interfaces.Swapable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 21.07.2016.
 */
public class GenericsSwap<T> implements Swapable {
    private List<T> elements;

    public GenericsSwap() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(this.elements, firstIndex, secondIndex);
    }

    @Override
    public void addElements(Object element) {
        this.elements.add((T) element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(String.format("%s: %s%n", element.getClass().getName(), element));
        }

        return sb.toString();
    }
}
