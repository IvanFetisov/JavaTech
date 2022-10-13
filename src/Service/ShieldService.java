package Service;
;
import Items.Shield;

import java.lang.reflect.Field;
import java.util.Random;

public class ShieldService {
    String[] names = {"Bobby","Dilly","Willy","Tommy"};
    String[] descriptions = {"McFucker","Strange","Stark","PiggyBack","Watermelon","Melon"};
    public  <T extends Shield> T createRandomShield(T t) throws IllegalAccessException {
        Random random = new Random();
        ItemCreationService itemCreationService = new ItemCreationService();

        Field[] fields = t.getClass().getFields();
        for (Field field: fields){
            field.setAccessible(true);
            if (field.getName().equals("name"))
                field.set(t,itemCreationService.setRandomNameToItem(itemCreationService.fillName(names)));
            if (field.getName().equals("damage"))
                field.setInt(t,random.nextInt(5));
            if (field.getName().equals("resist"))
                field.setInt(t,random.nextInt(5));
            if (field.getName().equals("weight"))
                field.setInt(t,random.nextInt(100));
            if (field.getName().equals("description"))
                field.set(t,itemCreationService.setRandomDescription(itemCreationService.fillName(descriptions)));

        }
        return t;
    }

}
