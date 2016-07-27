package _04_enumsAndAnnotations._09_trafficLights.enums;

/**
 * Created by User on 27.07.2016.
 */
public enum Light {
    RED,
    GREEN,
    YELLOW;

    private static Light[] values = Light.values();

    public Light next(){
        Light next = values[(this.ordinal() + 1) % values().length];
        return next;
    }
}
