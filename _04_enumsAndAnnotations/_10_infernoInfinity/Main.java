package _04_enumsAndAnnotations._10_infernoInfinity;

import _04_enumsAndAnnotations._10_infernoInfinity.enums.Gem;
import _04_enumsAndAnnotations._10_infernoInfinity.enums.WeaponType;
import _04_enumsAndAnnotations._10_infernoInfinity.interfaces.Weapon;
import _04_enumsAndAnnotations._10_infernoInfinity.models.WeaponImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 27.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Weapon> weapons = new HashMap<>();
        while (true){
            String[] params = reader.readLine().split(";");
            if(params[0].equals("END")){
                break;
            }

            switch (params[0]){
                case "Create": {
                    String name = params[2];
                    WeaponType weaponType = WeaponType.valueOf(params[1]);
                    Weapon weapon = new WeaponImpl(name, weaponType);
                    weapons.put(name, weapon);
                    break;
                }
                case "Add": {
                    String weaponName = params[1];
                    int index = Integer.parseInt(params[2]);
                    Gem gem = Gem.valueOf(params[3]);
                    Weapon currentWeapon = weapons.get(weaponName);
                    currentWeapon.addGem(gem, index);
                    weapons.put(weaponName, currentWeapon);
                    break;
                }
                case "Remove": {
                    String name = params[1];
                    int index = Integer.parseInt(params[2]);
                    Weapon weapon = weapons.get(name);
                    weapon.removeGem(index);
                    weapons.put(name, weapon);
                    break;
                }
                case "Print": {
                    String name = params[1];
                    Weapon weapon = weapons.get(name);
                    System.out.println(weapon.toString());
                    break;
                }
                case "Compare": {
                    String firstWeapon = params[1];
                    String secondWeapon = params[2];
                    Weapon weaponF = weapons.get(firstWeapon);
                    Weapon weaponS = weapons.get(secondWeapon);
                    int retval = weaponF.compareTo(weaponS);
                    if(retval == 1 || retval == 0){
                        System.out.print(weaponF);
                        System.out.printf(" (Item Level: %.1f)%n",weaponF.getAverage());
                    } else if(retval == -1){
                        System.out.print(weaponS);
                        System.out.printf(" (Item Level: %.1f)%n",weaponS.getAverage());
                    }
                }
            }
        }
    }
}
