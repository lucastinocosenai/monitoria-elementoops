package creature;

import element.Element;

public class Creature {
    private String name;
    private Element element;

    public Creature(String name, Element element) {
        this.name = name;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public Element getElement() {
        return element;
    }
}
