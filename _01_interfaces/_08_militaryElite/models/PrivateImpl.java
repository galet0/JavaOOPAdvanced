package _01_interfaces._08_militaryElite.models;

import _01_interfaces._08_militaryElite.interfaces.Private;

/**
 * Created by User on 18.07.2016.
 */
public class PrivateImpl extends SoldierImpl implements Private{
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s Salary: %.2f",super.toString(),this.getSalary());
    }
}
