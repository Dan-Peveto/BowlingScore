import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Leagues.WorldLeagueScorer;

public class WorldLeagueBowlingGameTest {
    
    // All Gutters Game
    @Test
    public void allGuttersGameScoreShouldBeZero() {
        Game game = new Game(new WorldLeagueScorer());
        rollMany(game, 20, 0);
    }
    // allOnesGameShouldScoreTwenty
    // spareShoulGetFirstRollBonus such that roles 5, 5, 3 = 18
    // strikeShouldGetThirtyNoBonus, such that roles 10, 2, 7 = 39
    // perfectGameShouldGetPerfectScore, such that 10 roles of 10 = 300

    private static void rollMany(Game game, int rolls, int pins) {
        for (int roll = 0; roll < rolls; roll++) {
            game.roll(pins);
        }
    }
}
