package _04_enumsAndAnnotations._10_infernoInfinity.interfaces;

import _04_enumsAndAnnotations._10_infernoInfinity.enums.Gem;
import _04_enumsAndAnnotations._10_infernoInfinity.models.WeaponImpl;

/**
 * Created by User on 27.07.2016.
 */
public interface Weapon extends Comparable<Weapon>{
    void addGem(Gem gem, int index);
    void removeGem(int index);
    String getName();
    double getAverage();
}
