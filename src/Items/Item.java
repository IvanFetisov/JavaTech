package Items;

import Enumeration.ItemType;

public abstract class Item {
    public String name;

    public int damage;

    public String description;

    public int heal;

    public int superPower;

    public ItemType itemType;

    public Item(String name, int damage, String description, int heal, int superPower, ItemType itemType) {
        this.name = name;
        this.damage = damage;
        this.description = description;
        this.heal = heal;
        this.superPower = superPower;
        this.itemType = itemType;
    }

    protected Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getSuperPower() {
        return superPower;
    }

    public void setSuperPower(int superPower) {
        this.superPower = superPower;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", description='" + description + '\'' +
                ", heal=" + heal +
                ", superPower=" + superPower +
                ", itemType=" + itemType +
                '}';
    }
}
