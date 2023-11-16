package Leagues;

// Define the World Leagu bowling Game Scorer
public class WorldLeagueScorer extends Scorer{
    @Override
    
    public int score(int[] rolls) {
        int score = 0; 
        int roll = 0;
        for (int frame = 0; frame < 10; frame++) {
            score += scoreOpenFrame(rolls, roll);
        }
        return score;
    }
    private int scoreOpenFrame(int[] rolls, int roll) {
        return rolls[roll] + rolls[roll + 1];
    }
}
