import java.lang.reflect.Array;
import java.util.*;


public class Players {
    
    // Data
    protected HashMap<String, Integer> playerMap = new  HashMap<String, Integer>();
    protected ArrayList<Integer> scoreList = new ArrayList<Integer>();
    // Fields
    public void addPlayers() {
        System.out.print("How maner players: "); // How many Players
        Scanner scanner = new Scanner(System.in);
        int numOfPlayers = scanner.nextInt();
        scanner.nextLine();
        int playerNum = 1;
    
        // take in player name and add to the list
        while (playerNum <= numOfPlayers) {  // Name each player 
            System.out.print("Name Player " + playerNum +": ");
            String playerName = scanner.nextLine();
            playerMap.put(playerName, 0);
            playerNum++;
        }
        scanner.close();
    }    
    // Contructors


}


    
    
