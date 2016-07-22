package _01_interfaces._09_collectionHierarchy.interfaces;

import java.util.List;

/**
 * Created by User on 19.07.2016.
 */
public interface Removeable extends Addable{
    List<String> remove(int index);

}
