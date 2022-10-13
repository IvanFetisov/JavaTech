package Service;

import Clans.Clan;
import Exceptions.NotEnoughGoldException;

public class ClanEconomyService implements Runnable {

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
        thread.suspend();
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
