package pr0304Barracks.core.commands;

import pr0304Barracks.annotations.Inject;
import pr0304Barracks.contracts.Repository;

/**
 * Created by User on 31.07.2016.
 */
public class RetireCommand extends Command {
    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        this.repository.removeUnit(unitType);
        String toRemove = String.format("%s retired!", unitType);
        return toRemove;
    }
}
