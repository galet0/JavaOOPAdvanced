package _01_interfaces._03_ferrari.models;

import _01_interfaces._03_ferrari.interfaces.Car;

/**
 * Created by User on 16.07.2016.
 */
public class Ferrari implements Car{
    private static final String MODEL = "488-Spider";

    private String driverName;

    public Ferrari(String driverName) {
        this.setDriverName(driverName);
    }

    public String getDriverName() {
        return driverName;
    }

    private void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String getMODEL() {
        return MODEL;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gasPush() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMODEL())
                .append("/")
                .append(brakes())
                .append("/")
                .append(gasPush())
                .append("/")
                .append(getDriverName());
        return sb.toString();

    }
}
