package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    //test if the equation works for example provided in assignment
    void calculateMonthsUntilPaidOffTest(){
        PaymentCalculator paymentCalculatorTest = new PaymentCalculator();

       paymentCalculatorTest.setBalance(Math.ceil(5000));
       paymentCalculatorTest.setPercentageAPR(12/100.0);
       paymentCalculatorTest.setMonthlyPayment(100);

        int expected = 70;
        int actual   = (int) Math.ceil(paymentCalculatorTest.calculateMonthsUntilPaidOff());
        assertEquals(expected,actual);
    }
}