package Service;

import Clans.Clan;
import Exceptions.NotEnoughGoldException;

import java.util.Arrays;
import java.util.Random;

public class ClanEconomyService implements Runnable {
    Random random = new Random();
    public int summToReceive = 20;

    public void setSummToReceive (int summToReceive){
        this.summToReceive = summToReceive;
    }
    public void addGoldFromMultipleClans(Clan... V ){
     for (Clan clan: Arrays.asList(V)){
         if (clan.getSumGolds()!=0){
         clan.setSumGolds(clan.getSumGolds()-summToReceive);
         }
     }
        transferToClan(V[random.nextInt(V.length)], summToReceive*V.length);
    }
    public void transferToClan(Clan clan,int summ){
        clan.setSumGolds(summ);
    }

    public void addGoldFromCoupleClans(Clan receiver, Clan giver, Clan giver1,int sum) throws NotEnoughGoldException {
        Thread thread = new Thread();
        thread.start();
        if (giver.getSumGolds()>sum||giver1.getSumGolds()>sum) {
            receiver.setSumGolds(receiver.getSumGolds()+sum+sum);
            giver.setSumGolds(giver1.getSumGolds()-sum);
            giver1.setSumGolds(giver1.getSumGolds()-sum);
        }else{
            throw new NotEnoughGoldException("You cant add more gold to different account if you dont have enough gold on account");
        }
        thread.yield();
    }
    public void sendGolds (int summ, Clan clan){
        if (clan.getSumGolds()>= summ) {
            getGolds(summ, clan);
            System.out.println("Success");
        }else {
            new NotEnoughGoldException("You dont have enough gold on Clan account"+ Clan.class);
        }
    }
    public int getGolds (int summ, Clan clan){
        int summOfAllClanGolds = clan.getSumGolds() + summ;
        clan.setSumGolds(summOfAllClanGolds);
        return summOfAllClanGolds;
    }





    @Override
    public void run() {

    }
}
