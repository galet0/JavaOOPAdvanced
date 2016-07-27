package _04_enumsAndAnnotations._10_infernoInfinity.models;

import _04_enumsAndAnnotations._10_infernoInfinity.enums.Gem;
import _04_enumsAndAnnotations._10_infernoInfinity.enums.WeaponType;
import _04_enumsAndAnnotations._10_infernoInfinity.interfaces.Weapon;

/**
 * Created by User on 27.07.2016.
 */
public class WeaponImpl implements Weapon, Comparable<Weapon> {
    private String name;
    private Gem[] sockets;
    private WeaponType weaponType;

    public WeaponImpl(String name, WeaponType weaponType) {
        this.setName(name);
        this.setWeaponType(weaponType);
        this.sockets = new Gem[this.getWeaponType().getSockets()];
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void addGem(Gem gem, int index) {
        if(index >= 0 && index < this.sockets.length){
            this.sockets[index] = gem;
        }
    }

    @Override
    public void removeGem(int index) {
        if(index >= 0 && index < this.sockets.length){
            this.sockets[index] = null;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    private int getVitality(){
        int vitality = 0;
        for (Gem socket : sockets) {
            if(socket != null){
                vitality += socket.getVitality();
            }
        }
        return vitality;
    }

    private int getMinDamage(){
        int minDamage = this.weaponType.getMinDamge();
        for (int i = 0; i < getAllStrength(); i++) {
            minDamage += 2;
        }

        for (int i = 0; i < getAllAgility(); i++) {
            minDamage += 1;
        }

        return minDamage;
    }
    
    private int getMaxDamage(){
        int maxDamage = this.getWeaponType().getMaxDamage();
        for (int i = 0; i < getAllStrength(); i++) {
            maxDamage += 3;
        }

        for (int i = 0; i < getAllAgility(); i++) {
            maxDamage += 4;
        }
        return maxDamage;
    }

    private int getAllStrength(){
        int strength = 0;
        for (Gem socket : sockets) {
            if(socket != null){
                strength += socket.getStrength();
            }
        }
        return strength;
    }

    private int getAllAgility(){
        int agility = 0;
        for (Gem socket : sockets) {
            if(socket != null){
                agility += socket.getAgility();
            }
        }
        return agility;
    }

    public double getAverage(){
        double average = ((this.getMinDamage() + this.getMaxDamage())/2.0) +
                            this.getAllStrength() +
                            this.getAllAgility() +
                            this.getVitality();
        return average;
    }

    @Override
    public String toString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.getName(),
                this.getMinDamage(),
                this.getMaxDamage(),
                this.getAllStrength(),
                this.getAllAgility(),
                this.getVitality());
    }


    @Override
    public int compareTo(Weapon weapon) {
        int retval = Double.compare(this.getAverage(),weapon.getAverage());
        return retval;
    }
}
