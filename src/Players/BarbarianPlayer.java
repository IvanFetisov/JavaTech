package Players;

import Enumeration.TypeEnum;
import Items.Item;
import Items.Shield;

public class BarbarianPlayer extends Player{

    Shield shield;

    public BarbarianPlayer() {

    }

    public BarbarianPlayer(String nickname, int helthPoints, int attackLevel, int level, TypeEnum playerType, Item item, Shield shield) {
        super(nickname, helthPoints, attackLevel, level, playerType, item);
        this.shield = shield;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "BarbarianPlayer{" +
                "shield=" + shield +
                ", nickname='" + nickname + '\'' +
                ", helthPoints=" + helthPoints +
                ", attackLevel=" + attackLevel +
                ", level=" + level +
                ", playerType=" + playerType +
                ", item=" + item +
                '}';
    }
}
