import java.util.ArrayList;
import java.util.Scanner;

import Leagues.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        
        System.out.print("How maner players: "); // How many Players
        Scanner scanner = new Scanner(System.in);
        int numOfPlayers = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Number of players: ");
        int playerNum = 1; // initialize order for the players
        ArrayList<String> playerList = new ArrayList<String>();//create array of players;

        // take in player name and add to the list
        while (playerNum <= numOfPlayers) {  // Name each player 
            System.out.print("Name Player " + playerNum +": ");
            String playerName = scanner.nextLine();
            playerList.add(playerName);
            playerNum++;
        }

        Players players = new Players(playerList);
        
        for(int i=0; i<playerList.size(); i++) {
            
        }
        /*
        Game game = new Game(new USLeagueScorer());
        game.roll(5);
        System.out.println(game.score());
         */
    }
}
