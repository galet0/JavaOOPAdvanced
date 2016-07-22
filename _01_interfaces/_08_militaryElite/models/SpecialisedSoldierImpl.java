package _01_interfaces._08_militaryElite.models;

import _01_interfaces._08_militaryElite.interfaces.SpecialisedSoldier;

/**
 * Created by User on 18.07.2016.
 */
public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        if(!corps.equals("Airforces") && !corps.equals("Marines")){
            throw new IllegalArgumentException("Invalid corps type!");
        }
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return String.format("%s%nCorps: %s",super.toString(), this.getCorps());
    }
}
