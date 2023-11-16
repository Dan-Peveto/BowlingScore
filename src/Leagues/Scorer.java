package Leagues;

// Defines an abstract type for scoring of rolls from a bowling game leauge
public abstract class Scorer {
    // Calculates the score from a sequence of rolls 
    public abstract int score(int[] rolls);

    // Deterimines if the first roll in a frame is a strik
    protected static boolean isStrikeFrame(int[] rolls, int roll) {
        return rolls[roll] == 10;
    }

    // Determines if the rolls in a frame are a spare
    protected static boolean isSpareFrame(int[] rolls, int roll) {
        return rolls[roll] + rolls[roll + 1] == 10;
    }
    
}
