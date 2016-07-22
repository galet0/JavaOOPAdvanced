package _02_generics._11_threeuple.models;

import _02_generics._11_threeuple.interfaces.Tuple;

/**
 * Created by User on 22.07.2016.
 */
public class TupleImpl<E1, E2> implements Tuple<E1, E2> {
    private E1 item1;
    private E2 item2;

    public TupleImpl(E1 item1, E2 item2) {
        this.setE1(item1);
        this.setE2(item2);
    }

    @Override
    public E1 getE1() {
        return this.item1;
    }

    @Override
    public void setE1(E1 item1) {
        this.item1 = item1;
    }

    @Override
    public E2 getE2() {
        return this.item2;
    }

    @Override
    public void setE2(E2 item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s",this.getE1(), this.getE2());
    }
}
