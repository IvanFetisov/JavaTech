package Clans;

import Exceptions.NotEnoughGoldException;
import Players.Player;

import java.util.List;

public abstract class Clan {

    public int level;

    public String name;

    public int summOfPlayers;

    public int sumGolds;

    List<Player> playersInClan;

    public Clan() {

    }

    public Clan(int level, String name, int summOfPlayers, List<Player> playersInClan) {
        this.level = level;
        this.name = name;
        this.summOfPlayers = summOfPlayers;
        this.playersInClan = playersInClan;
    }


    public void showPlayersInClan(){
        for (Player players: playersInClan){
            System.out.println(players.toString());
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSummOfPlayers() {
        return summOfPlayers;
    }

    public void setSummOfPlayers(int summOfPlayers) {
        this.summOfPlayers = summOfPlayers;
    }

    public int getSumGolds() {
        return sumGolds;
    }

    public void setSumGolds(int sumGolds) {
        this.sumGolds = sumGolds;
    }

    @Override
    public String toString() {
        return "Clans.Clan{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", summOfPlayers=" + summOfPlayers +
                ", sumGolds=" + sumGolds +
                //", playersInClan=" + playersInClan.toString() +
                '}';
    }
}
