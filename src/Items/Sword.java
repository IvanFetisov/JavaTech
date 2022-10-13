package Items;

import Enumeration.ItemType;

public class Sword extends Item{
    public Sword(String name, int damage, String description, int heal, int superPower, ItemType itemType) {
        super(name, damage, description, heal, superPower, itemType);
    }

    public Sword() {
    }
}
