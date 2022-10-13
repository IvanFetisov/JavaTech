package Players;

import Enumeration.MagicType;
import Enumeration.TypeEnum;
import Items.Item;

import java.lang.invoke.CallSite;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MagicianPlayer extends Player{
    private MagicType magicType;


    public static final List<MagicType> MAGIC_TYPES =
            Collections.unmodifiableList(Arrays.asList(MagicType.values()));
    private static final int SIZE = MAGIC_TYPES.size();
    private static final Random random = new Random();



    public MagicianPlayer(String nickname, int helthPoints, int attackLevel, int level, TypeEnum playerType, Item item, MagicType magicType) {
        super(nickname, helthPoints, attackLevel, level, playerType, item);
        this.magicType = magicType;
    }

    public MagicianPlayer() {

    }

    public MagicType getMagicType() {
        return magicType;
    }

    public void setMagicType(MagicType magicType) {
        this.magicType = magicType;
    }

    public static MagicType randomMagicType(){
        return MAGIC_TYPES.get(random.nextInt(SIZE));

    }

    @Override
    public String toString() {
        return "MagicianPlayer{" +
                "magicType=" + magicType +
                ", nickname='" + nickname + '\'' +
                ", helthPoints=" + helthPoints +
                ", attackLevel=" + attackLevel +
                ", level=" + level +
                ", playerType=" + playerType +
                ", item=" + item +
                '}';
    }
}
