import java.util.ArrayList;
import java.util.Scanner;


public class Players {
    
    // Data
    private ArrayList<String> playerList = new  ArrayList<String>();
    private ArrayList<Integer> scoreList = new ArrayList<Integer>();

   
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
            playerList.add(playerName);
            playerNum++;
        }
    }    
    // Contructors


}


    
    
