package _05_communication_and_events._02_kings_gambit.models;

import _05_communication_and_events._02_kings_gambit.interfaces.King;
import _05_communication_and_events._02_kings_gambit.interfaces.Unit;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 02.08.2016.
 */
public class KingImpl implements King{
    private String name;
    private Collection<Unit> unitsunderCommand;

    public KingImpl(String name) {
        this.setName(name);
        this.unitsunderCommand = new LinkedList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void respondsToAttacks() {
        System.out.printf("King %s is under attack!%n", this.getName());
        for (Unit unit : unitsunderCommand) {
            unit.handleRespondToAttack();
        }
    }

    @Override
    public void addUnits(List<Unit> units) {
        this.unitsunderCommand.addAll(units);
    }

    @Override
    public void removeDeadUnit(String unitName) {
        this.unitsunderCommand.removeIf(e -> e.getName().equals(unitName));
    }

    @Override
    public void respondToKill(String name) {
        for (Unit unit : this.unitsunderCommand) {
            if(unit.getName().equals(name)){
                unit.handleKill();
                break;
            }
        }
    }
}
