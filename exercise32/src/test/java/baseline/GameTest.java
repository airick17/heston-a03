package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void calcRandomNumberTest1() {
        Game game = new Game();
        game.setDifficulty(1);
        int randomNum = game.calcRandomNumber();
        boolean actual = randomNum > 0 && randomNum <= 10;
        assertTrue(actual);
    }

    @Test
    void calcRandomNumberTest2() {
        Game game = new Game();
        game.setDifficulty(2);
        int randomNum = game.calcRandomNumber();
        boolean actual = randomNum > 0 && randomNum <= 100;
        assertTrue(actual);
    }

    @Test
    void calcRandomNumberTest3() {
        Game game = new Game();
        game.setDifficulty(3);
        int randomNum = game.calcRandomNumber();
        boolean actual = randomNum > 0 && randomNum <= 1000;
        assertTrue(actual);
    }
}