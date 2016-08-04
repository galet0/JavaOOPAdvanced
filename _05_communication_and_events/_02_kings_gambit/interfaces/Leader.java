package _05_communication_and_events._02_kings_gambit.interfaces;

import java.util.List;

/**
 * Created by User on 02.08.2016.
 */
public interface Leader {
    void addUnits(List<Unit> units);
    void removeDeadUnit(String unitName);
    void respondToKill(String name);
}
