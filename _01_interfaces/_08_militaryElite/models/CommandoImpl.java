package _01_interfaces._08_militaryElite.models;

import _01_interfaces._08_militaryElite.interfaces.Commando;
import _01_interfaces._08_militaryElite.interfaces.Mission;

import java.util.Collection;

/**
 * Created by User on 18.07.2016.
 */
public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Collection<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps, Collection<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.setMissions(missions);
    }

    private void setMissions(Collection<Mission> missions) {
        this.missions = missions;
    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append("Missions:");
        for (Mission mission : missions) {
            sb.append(System.lineSeparator())
                    .append("  ")
                    .append(mission);
        }
        return sb.toString();
    }
}
