package _05_communication_and_events._01_event_implementation.interfaces;

/**
 * Created by User on 02.08.2016.
 */
public interface Dispatcher {

    void addNameChangeListener(NameChangeListener listener);

    void removeNameChangeListener(NameChangeListener listener);

    void fireNameChangeEvent();

    void setName(String name);
}
