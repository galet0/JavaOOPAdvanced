package pr0304Barracks.core.commands;

import pr0304Barracks.annotations.Inject;
import pr0304Barracks.contracts.Repository;

/**
 * Created by User on 31.07.2016.
 */
public class ReportCommand extends Command {
    @Inject
    private Repository repository;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String output = this.repository.getStatistics();
        return output;
    }
}
