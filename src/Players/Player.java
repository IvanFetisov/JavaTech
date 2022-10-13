package Players;

import Enumeration.TypeEnum;
import Items.Item;

public abstract class Player {



    public String nickname;

    public int helthPoints;

    public int attackLevel;

    public int level;

    TypeEnum playerType;

    Item item;

    public  Player(){
    }

    public Player(String nickname, int helthPoints, int attackLevel, int level, TypeEnum playerType, Item item) {
        this.nickname = nickname;
        this.helthPoints = helthPoints;
        this.attackLevel = attackLevel;
        this.level = level;
        this.playerType = playerType;
        this.item = item;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public TypeEnum getPlayerType() {
        return playerType;
    }

    public int getHelthPoints() {
        return helthPoints;
    }

    public void setHelthPoints(int helthPoints) {
        this.helthPoints = helthPoints;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public void setPlayerType(TypeEnum playerType) {
        this.playerType = playerType;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", helthPoints=" + helthPoints +
                ", attackLevel=" + attackLevel +
                ", level=" + level +
                ", playerType=" + playerType +
                ", item=" + item +
                '}';
    }
}
