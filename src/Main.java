
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
        //TODO: Тебе нужно добавить  PlayerService, который будет содержать дефолтные методы, также и метод по созданию рандомного пользователя
        //
        ClanEconomyService clanEconomyService = new ClanEconomyService();
        ItemCreationService itemCreationService = new ItemCreationService();
        Bow bow = new Bow();
        Item sword = new Sword();
        Item axe = new Axe();
        itemCreationService.createRandomItemUsingReflection(bow);
        itemCreationService.createRandomItemUsingReflection(sword);
        itemCreationService.createRandomItemUsingReflection(axe);
        ShieldService shieldService = new ShieldService();
        Shield shield = new FullShield();
        shieldService.createRandomShield(shield);
        PlayerService playerService = new PlayerService();

        System.out.println(playerService.createRandomPlayer());
    }
}
