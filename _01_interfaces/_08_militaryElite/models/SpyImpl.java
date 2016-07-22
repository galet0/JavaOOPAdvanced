package _01_interfaces._08_militaryElite.models;

/**
 * Created by User on 18.07.2016.
 */
public class SpyImpl extends SoldierImpl implements _01_interfaces._08_militaryElite.interfaces.Spy {
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("%s%nCode Number: %d",super.toString(), this.getCodeNumber());
    }
}
