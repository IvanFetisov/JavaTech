package Service;

import Enumeration.MagicType;
import Enumeration.TypeEnum;
import Items.*;
import Players.BarbarianPlayer;
import Players.MagicianPlayer;
import Players.Player;
import Players.ThiefPlayer;

import java.lang.reflect.Field;
import java.util.Random;

public class PlayerService {
    //TODO: Почему-то метод иногда возвращает нулл, и не все поля заполняет корректно. Надо подробнее разобраться
    //TODO: Основная догадка, почему не заполняются все поля, так это в разнице инициализации (Player player = BarbarianPlayer() и BarbarianPlayer player = BarbarianPlayer())
    ItemCreationService itemCreationService = new ItemCreationService();
    ShieldService shieldService = new ShieldService();
    TypeEnum typeEnum;
    private static final TypeEnum[] VALUE = TypeEnum.values();
    private static final int SIZE = VALUE.length;
    Random random = new Random();

    public TypeEnum getRandomType() {
        return VALUE[random.nextInt(SIZE)];
    }

    public String getRandomName() {
        String[] names = {"Billy", "Eleven", "Max", "Oddy", "Julia", "Ivan", "Andrew", "Kate"};
        return names[random.nextInt(names.length)];
    }

    public <T extends Player> Player createRandomPlayer() throws Exception {
        BarbarianPlayer barbarianPlayer = new BarbarianPlayer();
        MagicianPlayer magicianPlayer = new MagicianPlayer();
        ThiefPlayer thiefPlayer = new ThiefPlayer();
        Bow bow = new Bow();
        Sword sword = new Sword();
        Axe axe = new Axe();
        Shield shield = new FullShield();
        MagicType magicType;
        Item[] items = {axe, sword, bow};
        if (!getRandomType().equals(null)) {
            if (getRandomType().equals(TypeEnum.THIEF)) {
                Field[] fields = thiefPlayer.getClass().getFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (field.getName().equals("nickname")) {
                        field.set(thiefPlayer, getRandomName());
                    }
                    if (field.getName().equals("healthPoints")) {
                        field.setInt(thiefPlayer, random.nextInt(100));
                    }
                    if (field.getName().equals("attackLevel")) {
                        field.setInt(thiefPlayer, random.nextInt(20));
                    }
                    if (field.getName().equals("level")) {
                        field.setInt(thiefPlayer, random.nextInt(100));
                    }
                    if (field.getName().equals("superPower")) {
                        field.setInt(thiefPlayer, random.nextInt(1000));
                    }
                    if (field.getName().equals("item")) {
                        field.set(thiefPlayer,  itemCreationService.createRandomItem(sword));
                    }
                    if (field.getName().equals("isLucky")) {
                        field.set(thiefPlayer, true);
                    }
                    if (field.getName().equals("playerType")) {
                        field.set(thiefPlayer, thiefPlayer.getPlayerType());
                    }
                }

                return thiefPlayer;
            }
            if (getRandomType().equals(TypeEnum.BARBARIAN)) {
                Field[] fields = barbarianPlayer.getClass().getFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (field.getName().equals("nickname")) {
                        field.set(barbarianPlayer, getRandomName());
                    }
                    if (field.getName().equals("healthPoints")) {
                        field.set(barbarianPlayer, random.nextInt(100));
                    }
                    if (field.getName().equals("attackLevel")) {
                        field.set(barbarianPlayer, random.nextInt(20));
                    }
                    if (field.getName().equals("level")) {
                        field.set(barbarianPlayer, random.nextInt(100));
                    }
                    if (field.getName().equals("superPower")) {
                        field.set(barbarianPlayer, random.nextInt(1000));
                    }
                    if (field.getName().equals("item")) {
                        field.set(barbarianPlayer, itemCreationService.createRandomItem(sword));
                    }
                    if (field.getName().equals("shield")) {
                        field.set(barbarianPlayer, shieldService.createRandomShield(shield));
                    }
                    if (field.getName().equals("playerType")) {
                        field.set(barbarianPlayer, barbarianPlayer.getPlayerType());
                    }
                }
                return barbarianPlayer;
            }
            if (getRandomType().equals(TypeEnum.MAGICIAN)) {
                Field[] fields = magicianPlayer.getClass().getFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (field.getName().equals("nickname")) {
                        field.set(magicianPlayer, getRandomName());
                    }
                    if (field.getName().equals("healthPoints")) {
                        field.set(magicianPlayer, random.nextInt(100));
                    }
                    if (field.getName().equals("attackLevel")) {
                        field.set(magicianPlayer, random.nextInt(20));
                    }
                    if (field.getName().equals("level")) {
                        field.set(magicianPlayer, random.nextInt(100));
                    }
                    if (field.getName().equals("superPower")) {
                        field.set(magicianPlayer, random.nextInt(1000));
                    }
                    if (field.getName().equals("item")) {
                        field.set(magicianPlayer, itemCreationService.createRandomItem(new Sword()));
                    }
                    if (field.getName().equals("magicType")) {
                        field.set(magicianPlayer, MagicType.THUNDER);
                    }
                    if (field.getName().equals("playerType")) {
                        field.set(magicianPlayer, magicianPlayer.getPlayerType());
                    }

                }
                return magicianPlayer;

        }
    }
       return createRandomPlayer();
    }
}
