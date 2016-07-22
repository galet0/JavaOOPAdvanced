package _01_interfaces._08_militaryElite.models;

import _01_interfaces._08_militaryElite.interfaces.LeutenantGeneral;
import _01_interfaces._08_militaryElite.interfaces.Private;

import java.util.Collection;

/**
 * Created by User on 18.07.2016.
 */
public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {
    private Collection<Private> privates;

    public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary, Collection<Private> privates) {
        super(id, firstName, lastName, salary);
        this.setPrivates(privates);
    }

    private void setPrivates(Collection<Private> privates) {
        this.privates = privates;
    }

    @Override
    public Collection<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append("Privates:");
        for (Private aPrivate : privates) {
            sb.append(System.lineSeparator())
                    .append("  ")
                    .append(aPrivate);
        }

        return sb.toString();
    }
}
