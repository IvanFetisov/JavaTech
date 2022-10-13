package Players;

import Enumeration.TypeEnum;
import Items.Item;

public class ThiefPlayer extends  Player{
    public boolean isLucky;


    public ThiefPlayer() {

    }

    public ThiefPlayer(String nickname, int helthPoints, int attackLevel, int level, TypeEnum playerType, Item item, boolean isLucky) {
        super(nickname, helthPoints, attackLevel, level, playerType, item);
        this.isLucky = isLucky;
    }

    public boolean isLucky() {
        return isLucky;
    }

    public void setLucky(boolean lucky) {
        isLucky = lucky;
    }

    @Override
    public String toString() {
        return "ThiefPlayer{" +
                "isLucky=" + isLucky +
                ", nickname='" + nickname + '\'' +
                ", helthPoints=" + helthPoints +
                ", attackLevel=" + attackLevel +
                ", level=" + level +
                ", playerType=" + playerType +
                ", item=" + item +
                '}';
    }
}
