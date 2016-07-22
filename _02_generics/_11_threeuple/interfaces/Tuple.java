package _02_generics._11_threeuple.interfaces;

/**
 * Created by User on 22.07.2016.
 */
public interface Tuple<E1, E2> {

    E1 getE1();

    void setE1(E1 item1);

    E2 getE2();

    void setE2(E2 item2);
}
