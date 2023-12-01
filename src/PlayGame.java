import java.util.Scanner;

import Leagues.USLeagueScorer;

public class PlayGame {
    
    private Game game = new Game(new USLeagueScorer());
    private Scanner scanner = new Scanner(System.in);
    private int frameCount = 1;

    public void playGame() {
    while(frameCount <= 9) {
        System.out.println("Enter your score for frame " + frameCount + " roll one");
        int roll1 = scanner.nextInt();
        game.roll(roll1);
        if(roll1 == 10) {
            System.out.println("STRIKE");
            game.roll(roll1);
            frameCount++;
            continue;
        } else {
            System.out.println("Enter your score for frame " + frameCount + " roll two");
            int roll2 = scanner.nextInt();
            game.roll(roll2);
            frameCount++;
        }
    }    
    System.out.println("Enter your score for frame 10 roll 1");
    int roll1 = scanner.nextInt();
    game.roll(roll1);
    if(roll1 == 10) {
        System.out.println("STRIKE");
        System.out.println("Enter your score for frame 11"); 
        int roll1a = scanner.nextInt();
        game.roll(roll1a);
        if(roll1 == 10) {
            System.out.println("STRIKE");
            System.out.println("Enter your score for frame 12");
            int roll1b = scanner.nextInt();
            game.roll(roll1b);
        } 
    } else {
        System.out.println("Enter your score for frame 10 roll 2");
        int roll2 = scanner.nextInt();
        game.roll(roll2);
    }
    System.out.println(game.score());
    scanner.close();
    while(frameCount <= 9) {
            System.out.println("Enter your score for frame " + frameCount + " roll one");
            int roll = scanner.nextInt();
            game.roll(roll);
            if(roll1 == 10) {
                System.out.println("STRIKE");
                game.roll(roll);
                frameCount++;
                continue;
            } else {
                System.out.println("Enter your score for frame " + frameCount + " roll two");
                int roll2 = scanner.nextInt();
                game.roll(roll2);
                frameCount++;
            }
        }    
        System.out.println("Enter your score for frame 10 roll 1");
        int roll10 = scanner.nextInt();
        game.roll(roll1);
        if(roll10 == 10) {
            System.out.println("STRIKE");
            System.out.println("Enter your score for frame 11"); 
            int roll10a = scanner.nextInt();
            game.roll(roll10a);
            if(roll10a == 10) {
                System.out.println("STRIKE");
                System.out.println("Enter your score for frame 12");
                int roll10b = scanner.nextInt();
                game.roll(roll10b);
            } 
        } else {
            System.out.println("Enter your score for frame 10 roll 2");
            int roll20 = scanner.nextInt();
            game.roll(roll20);
        }
        System.out.println(game.score());
        scanner.close();
    }
}
