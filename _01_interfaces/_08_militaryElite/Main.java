package _01_interfaces._08_militaryElite;

import _01_interfaces._08_militaryElite.interfaces.Mission;
import _01_interfaces._08_militaryElite.interfaces.Private;
import _01_interfaces._08_militaryElite.interfaces.Repair;
import _01_interfaces._08_militaryElite.interfaces.Soldier;
import _01_interfaces._08_militaryElite.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 18.07.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Soldier> soldiers = new LinkedList<>();
        Map<Integer, Private> privates = new LinkedHashMap<>();
        while (true){
            String[] input = reader.readLine().split("\\s+");
            if(input[0].equals("End")){
                break;
            }
            int id = Integer.parseInt(input[1]);
            String firstName = input[2];
            String lastName = input[3];

            switch (input[0]){
                case "Private":
                    double salary = Double.parseDouble(input[4]);
                    Private privateSoldier = new PrivateImpl(id, firstName, lastName, salary);
                    soldiers.add(privateSoldier);
                    privates.put(privateSoldier.getId(), privateSoldier);
                    break;
                case "LeutenantGeneral":
                    double salaryLeutenant = Double.parseDouble(input[4]);
                    List<Private> privatesList = new LinkedList<>();
                    for (int i = 5; i < input.length; i++) {
                        Private soldierGeneral = privates.get(Integer.parseInt(input[i]));
                        privatesList.add(soldierGeneral);
                    }
                    Soldier leutenant = new LeutenantGeneralImpl(id, firstName, lastName, salaryLeutenant, privatesList);
                    soldiers.add(leutenant);
                    break;
                case "Engineer":
                    double salaryEngineer = Double.parseDouble(input[4]);
                    String corpsEngineer = input[5];
                    List<Repair> repairs = new LinkedList<>();
                    for (int i = 6; i < input.length; i += 2) {
                        Repair repair = new RepairImpl(input[i], Integer.parseInt(input[i + 1]));
                        repairs.add(repair);
                    }
                    try {
                        Soldier engineer = new EngineerImpl(id, firstName, lastName, salaryEngineer, corpsEngineer, repairs);
                        soldiers.add(engineer);
                    } catch (IllegalArgumentException iae){

                    }

                    break;
                case "Commando":
                    double salaryCommando = Double.parseDouble(input[4]);
                    String corps = input[5];
                    List<Mission> missions = new LinkedList<>();
                    for (int i = 6; i < input.length; i += 2) {
                        try {
                            Mission mission = new MissionImpl(input[i], input[i + 1]);
                            missions.add(mission);
                        } catch (IllegalArgumentException iae){

                        }
                    }
                    try {
                        Soldier commando = new CommandoImpl(id, firstName, lastName, salaryCommando, corps, missions);
                        soldiers.add(commando);
                    } catch (IllegalArgumentException iae){

                    }
                    break;
                case "Spy":
                    int codeNumber = Integer.parseInt(input[4]);
                    Soldier spy = new SpyImpl(id, firstName, lastName, codeNumber);
                    soldiers.add(spy);
                    break;

            }
        }

        for (Soldier soldier : soldiers) {
            System.out.println(soldier.toString());
        }
    }
}
