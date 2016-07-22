package _02_generics._09_customListIterator.models;


import _02_generics._09_customListIterator.interfaces.CustomList;
import _02_generics._09_customListIterator.interfaces.Sorter;

/**
 * Created by User on 21.07.2016.
 */
public class SorterImpl<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public void sort(CustomList<T> elements) {
        for (int i = 0; i < elements.getSize(); i++) {
            T currentElement = elements.get(i);

            for (int j = i + 1; j < elements.getSize(); j++) {
                if(currentElement.compareTo(elements.get(j)) > 0){
                    elements.swap(i, j);
                }
            }
        }
    }
}
