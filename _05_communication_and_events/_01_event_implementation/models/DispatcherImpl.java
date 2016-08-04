package _05_communication_and_events._01_event_implementation.models;

import _05_communication_and_events._01_event_implementation.interfaces.Dispatcher;
import _05_communication_and_events._01_event_implementation.interfaces.NameChangeListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 01.08.2016.
 */
public class DispatcherImpl implements Dispatcher {
    private String name;
    private List<NameChangeListener> nameChangeListeners;

    public DispatcherImpl(String name) {
        this.name = name;
        this.nameChangeListeners = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void addNameChangeListener(NameChangeListener listener) {
        this.nameChangeListeners.add(listener);
    }

    @Override
    public void removeNameChangeListener(NameChangeListener listener) {
        if(this.nameChangeListeners.size() != 0){
            this.nameChangeListeners.remove(listener);
        }
    }

    @Override
    public void fireNameChangeEvent() {
        NameChange listener = new NameChange(this, this.getName());
        for (NameChangeListener nameChangeListener : nameChangeListeners) {
            nameChangeListener.handleChangedName(listener);
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
        this.fireNameChangeEvent();
    }

}
