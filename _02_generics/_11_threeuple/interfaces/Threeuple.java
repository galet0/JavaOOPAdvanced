package _02_generics._11_threeuple.interfaces;

/**
 * Created by User on 22.07.2016.
 */
public interface Threeuple<E1, E2, E3> extends Tuple<E1, E2> {
    E3 getE3();

    void setE3(E3 item3);
}
