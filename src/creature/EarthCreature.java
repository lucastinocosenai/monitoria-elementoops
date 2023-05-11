package creature;

import element.Earth;
import element.Element;

public class EarthCreature extends Creature {
    private static final String NAME = "StoneDev";
    private static final Element ELEMENT = new Earth();
    public EarthCreature() {
        super(NAME, ELEMENT);
    }
}
