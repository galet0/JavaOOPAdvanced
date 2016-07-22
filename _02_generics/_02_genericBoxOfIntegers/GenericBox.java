package _02_generics._02_genericBoxOfIntegers;

/**
 * Created by User on 20.07.2016.
 */
public class GenericBox<T> {
    private T t;

    public GenericBox(T t) {
        this.setT(t);
    }

    public T getT() {
        return t;
    }

    private void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.t.getClass().getName(), t);
    }
}
