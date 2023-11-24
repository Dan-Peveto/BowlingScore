import java.util.ArrayList;
import java.util.Scanner;

import Leagues.USLeagueScorer;


public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in); // initiate scanner
    
    System.out.print("How maner players: "); // How many Players
    int numOfPlayers = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Number of players: ");
    int playerNum = 1; // initialize order for the players
    ArrayList<String> playerList = new ArrayList<String>();//create array of players;
    while (playerNum <= numOfPlayers) {  // Name each player 
        System.out.print("Name Player " + playerNum +":");
        String playerName = scanner.nextLine();
        playerList.add(playerName);
        playerNum++;
    }
    for(int i=0; i<playerList.size(); i++) {
        System.out.println(playerList.get(i));
    }    
    System.out.println(playerList.size());
        /*
        Game game = new Game(new USLeagueScorer());
        game.roll(5);
        System.out.println(game.score());
         */
    }
}
