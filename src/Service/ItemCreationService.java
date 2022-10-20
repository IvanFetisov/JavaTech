package Service;

import Enumeration.ItemType;
import Items.Axe;
import Items.Bow;
import Items.Item;
import Items.Sword;
import Players.Player;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemCreationService {

    private String[] names = new String[10];
    private String[] descriptions = new String[10];
    private static final Random random = new Random();

    private ItemType itemType;

    public static final List<ItemType> ITEM_TYPES =
            Collections.unmodifiableList(Arrays.asList(ItemType.values()));
    public Player setItemToPlayer(Player player,Item item){
        player.setItem(item);
        return player;
    }
    public Player setRandomItemToPlayer(Player player) throws ClassNotFoundException, IllegalAccessException {
        Item bow = new Bow();
        Item axe = new Axe();
        Item sword = new Sword();
        List<Item> items = new ArrayList<>();
        items.add(createRandomItemUsingReflection(bow));
        items.add(createRandomItemUsingReflection(axe));
        items.add(createRandomItemUsingReflection(sword));
        if (player.getClass().getSimpleName().equals("Barbarian")){
         for (Item item:items){
             if (item.getItemType().equals("Axe")){
                 player.setItem(item);
             }
         }
        }
        if (player.getClass().getSimpleName().equals("MagicianPlayer")){
         for (Item  item:items){
             if (item.getItemType().equals("Sword"));
             player.setItem(item);
         }
        }
        if (player.getClass().getSimpleName().equals("ThiefPlayer")){
        for (Item item:items){
            player.setItem(item);
        }
        }
        return player;
    }


    public  Item createRandomItem(Item item) throws NoSuchFieldException, IllegalAccessException {
        item.setName(setRandomNameToItem(fillName(names)));
        item.setDescription(setRandomDescription(fillDescription(descriptions)));
        item.setHeal(setRandomHeal());
        item.setDamage(setRandomDamageToItem());
        item.setSuperPower(setRandomDamageToItem());
        return item;
    }
    public Item createRandomItemUsingReflection(Item item) throws IllegalAccessException, ClassNotFoundException {
        Bow bow = new Bow();
        Sword sword = new Sword();
        Axe axe = new Axe();
        if (item.getClass().getSimpleName().equals("Bow")){
            Field[] fields = item.getClass().getFields();
            for (Field field: fields){
                if (field.getName().equals("name"))
                    item.setName(setRandomNameToItem(fillName(names)));
                if(field.getName().equals("description"))
                    item.setDescription(setRandomDescription(fillDescription(descriptions)));
                if (field.getName().equals("damage"))
                    field.setInt(item,setRandomDamageToItem());
                if (field.getName().equals("heal"))
                    field.setInt(item,setRandomHeal());
                if (field.getName().equals("superPower"))
                    field.setInt(item,random.nextInt(30));
                if (field.getName().equals("itemType"))
                    field.set(item,ItemType.Bow);
            }
        }
        if (item.getClass().getSimpleName().equals("Axe")){
            Field[] fields = axe.getClass().getFields();
                for (Field field:fields){
                    if (field.getName().equals("name"))
                        item.setName(setRandomNameToItem(fillName(names)));
                    if (field.getName().equals("description"))
                        item.setDescription(setRandomDescription(fillDescription(descriptions)));
                    if (field.getName().equals("damage"))
                        field.setInt(item,setRandomDamageToItem());
                    if (field.getName().equals("heal"))
                        field.setInt(item,setRandomHeal());
                    if (field.getName().equals("superPower"))
                        field.setInt(item, random.nextInt(40));
                    if (field.getName().equals("itemType"))
                        field.set(item,ItemType.Axe);
                }
        }
        if (item.getClass().getSimpleName().equals("Sword")){
            Field[] fields = axe.getClass().getFields();
            for (Field field:fields){
                if (field.getName().equals("name"))
                    item.setName(setRandomNameToItem(fillName(names)));
                if (field.getName().equals("description"))
                    item.setDescription(setRandomDescription(fillDescription(descriptions)));
                if (field.getName().equals("damage"))
                    field.setInt(item,setRandomDamageToItem());
                if (field.getName().equals("heal"))
                    field.setInt(item,setRandomHeal());
                if (field.getName().equals("superPower"))
                    field.setInt(item, random.nextInt(40));
                if (field.getName().equals("itemType"))
                    field.set(item,ItemType.Sword);
            }
        }
        return item;
    }
    public String setRandomNameToItem(String[] names){
    fillName(names);
        String name = names[random.nextInt(this.names.length)];
        return name;
    }
    public int setRandomDamageToItem(){
        return random.nextInt(20);
    }
    public String setRandomDescription(String[] descriptions){
        fillDescription(descriptions);
        String description = descriptions[random.nextInt(this.descriptions.length)];
        return description;
    }
    public String[] fillDescription(String[] descriptions){
    List<String> list = new ArrayList<>();
    String description1 = "Was made in fire";
    String description2 = "Created by Elf";
    String description3 = "Made by mistake";
    String description4 = "Founded in dungeon";
    String description5 = "Destroyed by dragon";
    String description6 = "Chuck Norris cant break it";
    String description7 = "It's leg of t-800";
    String description8 = "Founded in strange things";
    String description9 = "Born in antioxidant";
    String description10 = "Cat";
    list.add(description1);
    list.add(description2);
    list.add(description3);
    list.add(description4);
    list.add(description5);
    list.add(description6);
    list.add(description7);
    list.add(description8);
    list.add(description9);
    list.add(description10);
    descriptions = list.stream().collect(Collectors.toList()).toArray(new String[0]);
    return descriptions;
    }
    public int setRandomHeal(){
        return random.nextInt(10);
    }
    public static ItemType setRandomItemType(){
        return  ITEM_TYPES.get(random.nextInt(ITEM_TYPES.size()));
    }

    public String[] fillName(String[] names){
        List<String>  list = new ArrayList<>();
        String name1 = "Brutal";
        String name2 = "Awesome";
        String name3 = "Colourful";
        String name4 = "Wonderful";
        String name5 = "Handsome";
        String name6 = "Beauty";
        String name7 = "Beast";
        String name8 = "BlueBlood";
        String name9 = "RedHead";
        String name10 = "Green";
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        list.add(name5);
        list.add(name6);
        list.add(name7);
        list.add(name8);
        list.add(name9);
        list.add(name10);
        names = list.stream().collect(Collectors.toList()).toArray(new String[0]);
        return names;
    }

}

