package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest {

    @Test
    void randomNumberGeneratorRangeTest(){
        for(int i = 0; i < 100000; i++){
            MagicBall magicBall = new MagicBall();
            int placeHold = magicBall.randomNumberGenerator();
            if (placeHold >= 1 && placeHold <= 4){
                placeHold = 1;
            }
            else placeHold = 0;

            int expected = 1;
            int actual = placeHold;

            assertEquals(expected, actual);
        }
    }
}