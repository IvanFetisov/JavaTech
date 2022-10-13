package Items;

import java.util.Objects;

public abstract class Shield {
    public int damage ;
    public int resist ;

    public String name ;
    public int weight;

    public String description;


    public Shield(int damage, int resist, String name, int weight,String description) {
        this.damage = damage;
        this.resist = resist;
        this.name = name;
        this.weight = weight;
        this.description = description;
    }

    protected Shield() {
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getResist() {
        return resist;
    }

    public void setResist(int resist) {
        this.resist = resist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shield shield = (Shield) o;
        return damage == shield.damage && resist == shield.resist && weight == shield.weight && Objects.equals(name, shield.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(damage, resist, name, weight);
    }

    @Override
    public String toString() {
        return "Shield{" +
                "damage=" + damage +
                ", resist=" + resist +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
