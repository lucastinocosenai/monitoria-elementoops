package creature;

import element.Fire;
import element.Element;

public class FireCreature extends Creature {
    private static final String NAME = "VolcanoHacker";
    private static final Element ELEMENT = new Fire();
    public FireCreature() {
        super(NAME, ELEMENT);
    }
}
