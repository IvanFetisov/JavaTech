package Clans;

import Players.Player;

import java.util.List;

public class MagicianClan extends Clan{
    private int magicianBooks ;

    public MagicianClan() {

    }

    public MagicianClan(int level, String name, int summOfPlayers, List<Player> playersInClan, int magicianBooks) {
        super(level, name, summOfPlayers, playersInClan);
        this.magicianBooks = magicianBooks;
    }
    public List<Player> healClan(){
        for (Player magicianPlayer: playersInClan){
            int healthSumm = magicianPlayer.getHelthPoints() + (magicianPlayer.getHelthPoints()/10);
            magicianPlayer.setHelthPoints(healthSumm);

        }
        return playersInClan;
    }

    @Override
    public String toString() {
        return "MagicianClan{" +
                "magicianBooks=" + magicianBooks +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", summOfPlayers=" + summOfPlayers +
                ", sumGolds=" + sumGolds +
                ", playersInClan=" + playersInClan.toString() +
                '}';
    }
}
