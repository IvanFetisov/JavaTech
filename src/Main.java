
import Annotations.Loggable;
import Service.PlayerService;

public class Main {
    @Loggable
    public static void main(String[] args) throws Exception {
     PlayerService playerService = new PlayerService();
     playerService.createRandomPlayer();

    }
}
