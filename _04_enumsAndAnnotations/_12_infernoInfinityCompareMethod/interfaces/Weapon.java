package _04_enumsAndAnnotations._12_infernoInfinityCompareMethod.interfaces;


import _04_enumsAndAnnotations._12_infernoInfinityCompareMethod.enums.Gem;

public interface Weapon extends Comparable<Weapon>{
    void addGem(Gem gem, int index);
    void removeGem(int index);
    String getName();
    double getAverage();
}
