package Clans;

import Players.Player;

import java.util.List;

public class ThiefClan extends Clan{
    public ThiefClan() {
    }

    public ThiefClan(int level, String name, int summOfPlayers, List<Player> playersInClan) {
        super(level, name, summOfPlayers, playersInClan);
    }

    @Override
    public String toString() {
        return "ThiefClan{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", summOfPlayers=" + summOfPlayers +
                ", sumGolds=" + sumGolds +
                ", playersInClan=" + playersInClan +
                '}';
    }
}
