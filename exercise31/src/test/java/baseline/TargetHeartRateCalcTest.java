package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateCalcTest {

    @Test
    void calculateRateTest(){
        TargetHeartRateCalc targetHeartRateCalcTest = new TargetHeartRateCalc();
        targetHeartRateCalcTest.setAge(22);
        targetHeartRateCalcTest.setRestingPulse(65);
        targetHeartRateCalcTest.setIntensity(55);

        int expected = 138;
        int actual = targetHeartRateCalcTest.calculateRate();

        assertEquals(expected, actual);
    }


}