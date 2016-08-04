package _05_communication_and_events._01_event_implementation;

import _05_communication_and_events._01_event_implementation.interfaces.Dispatcher;
import _05_communication_and_events._01_event_implementation.models.DispatcherImpl;
import _05_communication_and_events._01_event_implementation.models.Handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 01.08.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Dispatcher dispatcher = new DispatcherImpl(null);
        Handler handler = new Handler();

        dispatcher.addNameChangeListener(handler);
        while (true){
            String name = reader.readLine();
            if(name.equals("End")){
                break;
            }
            dispatcher.setName(name);
        }
    }
}
