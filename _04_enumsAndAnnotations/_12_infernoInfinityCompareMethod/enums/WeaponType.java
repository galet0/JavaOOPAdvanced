package _04_enumsAndAnnotations._12_infernoInfinityCompareMethod.enums;

/**
 * Created by User on 27.07.2016.
 */
public enum WeaponType {
    AXE(5, 10, 4),
    SWORD(4, 6, 3),
    KNIFE(3, 4, 2);

    private int minDamge;
    private int maxDamage;
    private int sockets;

    WeaponType(int minDamge, int maxDamage, int sockets) {
        this.minDamge = minDamge;
        this.maxDamage = maxDamage;
        this.sockets = sockets;
    }

    public int getMinDamge() {
        return this.minDamge;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }

    public int getSockets() {
        return this.sockets;
    }
}
