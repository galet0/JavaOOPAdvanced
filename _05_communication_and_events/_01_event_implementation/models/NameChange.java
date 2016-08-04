package _05_communication_and_events._01_event_implementation.models;

import java.util.EventObject;

/**
 * Created by User on 02.08.2016.
 */
public class NameChange extends EventObject {

    private String changedName;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public NameChange(Object source, String changedName) {
        super(source);
        this.changedName = changedName;
    }

    public String getChangedName() {
        return this.changedName;
    }
}
