package Clans;

import Clans.Clan;
import Players.Player;

import java.util.List;

public class BarbarianClan extends Clan {
    public int ships;
    public BarbarianClan() {
    }

    public BarbarianClan(int level, String name, int summOfPlayers, List<Player> playersInClan, int ships) {
        super(level, name, summOfPlayers, playersInClan);
        this.ships=ships;
    }
}
