

// Defines a scorable bowling game
public class Game {
    
    // Fields 
    private Scorer _scorer;
    private int[] _rolls = new int[21];
    private int _turn = 0;

    // Instantiates a new game using a scoring algorithm scorer calculates roll scores for the game
    public Game(Scorer scorer) {
        _scorer = scorer;
    }

    // Updates game rolls with the number of pins 
    public void roll(int pins) {
        _rolls[_turn++] = pins;
    }

    // Scores the rolls of the games
    public int score() {
        return _scorer.score(_rolls);
    }

    public void roll(int pins) {
        _rolls[_turn++] = pins;
    }
    
}
