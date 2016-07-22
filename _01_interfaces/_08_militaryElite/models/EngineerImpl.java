package _01_interfaces._08_militaryElite.models;

import _01_interfaces._08_militaryElite.interfaces.Engineer;
import _01_interfaces._08_militaryElite.interfaces.Repair;

import java.util.Collection;

/**
 * Created by User on 18.07.2016.
 */
public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Collection<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps, Collection<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(repairs);
    }

    private void setRepairs(Collection<Repair> repairs) {
        this.repairs = repairs;
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append("Repairs:");

        for (Repair repair : repairs) {
            sb.append(System.lineSeparator())
                    .append("  ")
                    .append(repair);
        }
        return sb.toString();
    }
}
