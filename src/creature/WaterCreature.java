package creature;

import element.Water;
import element.Element;

public class WaterCreature extends Creature {
    private static final String NAME = "WaveNerd";
    private static final Element ELEMENT = new Water();
    public WaterCreature() {
        super(NAME, ELEMENT);
    }
}
