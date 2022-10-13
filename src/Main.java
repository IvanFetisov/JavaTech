
import Clans.BarbarianClan;
import Clans.Clan;
import Clans.MagicianClan;
import Clans.ThiefClan;
import Enumeration.TypeEnum;
import Items.*;
import Players.BarbarianPlayer;
import Players.MagicianPlayer;
import Players.Player;
import Service.ClanEconomyService;
import Service.ItemCreationService;
import Service.PlayerService;
import Service.ShieldService;

public class Main {
    public static void main(String[] args) throws Exception {
         Clan clan = new BarbarianClan();
         Clan clan1 = new ThiefClan();
         Clan clan2 = new ThiefClan();
         clan.setSumGolds(20);
         clan1.setSumGolds(20);
         clan2.setSumGolds(20);
         Clan clan3 = new BarbarianClan();
         ClanEconomyService clanEconomyService = new ClanEconomyService();
         clanEconomyService.setSummToReceive(10);
         clanEconomyService.addGoldFromMultipleClans(clan,clan1,clan2,clan3);
        System.out.println(clan1.toString());
        System.out.println(clan.toString());
        System.out.println(clan2.toString());
        System.out.println(clan3.toString());
    }
}
