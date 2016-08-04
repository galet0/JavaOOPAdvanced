package _05_communication_and_events._01_event_implementation.models;

import _05_communication_and_events._01_event_implementation.interfaces.NameChangeListener;

/**
 * Created by User on 02.08.2016.
 */
public class Handler implements NameChangeListener {
    @Override
    public void handleChangedName(NameChange event) {
        System.out.printf("Dispatcher's name changed to %s.\n", event.getChangedName());
    }
}
