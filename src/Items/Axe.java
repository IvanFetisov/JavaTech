package Items;

import Enumeration.ItemType;

public class Axe extends Item{
    public Axe(String name, int damage, String description, int heal, int superPower, ItemType itemType) {
        super(name, damage, description, heal, superPower, itemType);
    }

    public Axe() {
    }
}
