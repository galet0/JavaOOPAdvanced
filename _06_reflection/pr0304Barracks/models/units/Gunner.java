package pr0304Barracks.models.units;

/**
 * Created by User on 30.07.2016.
 */
public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALHT = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALHT, GUNNER_DAMAGE);
    }
}
