package creature;

import element.Air;
import element.Element;

public class AirCreature extends Creature {
    private static final String NAME = "BreezeProgrammer";
    private static final Element ELEMENT = new Air();
    public AirCreature() {
        super(NAME, ELEMENT);
    }
}
