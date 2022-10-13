package Items;

import Enumeration.ItemType;

public class Bow extends Item{
    public Bow(String name, int damage, String description, int heal, int superPower, ItemType itemType) {
        super(name, damage, description, heal, superPower, itemType);
    }

    public Bow() {
    }
}
