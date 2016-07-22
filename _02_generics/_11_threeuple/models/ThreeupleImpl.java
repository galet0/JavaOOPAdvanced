package _02_generics._11_threeuple.models;

import _02_generics._11_threeuple.interfaces.Threeuple;

/**
 * Created by User on 22.07.2016.
 */
public class ThreeupleImpl<E1, E2, E3> extends TupleImpl<E1, E2> implements Threeuple<E1, E2, E3> {
    private E3 item3;

    public ThreeupleImpl(E1 item1, E2 item2, E3 item3) {
        super(item1, item2);
        this.setE3(item3);
    }

    @Override
    public E3 getE3() {
        return this.item3;
    }

    @Override
    public void setE3(E3 item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", super.toString(), this.getE3());
    }
}
