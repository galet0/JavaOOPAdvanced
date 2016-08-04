package _05_communication_and_events._01_event_implementation.interfaces;

import _05_communication_and_events._01_event_implementation.models.NameChange;

/**
 * Created by User on 02.08.2016.
 */
public interface NameChangeListener {
    void handleChangedName(NameChange event);
}
