package baseline;/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

public class Solution26 {
    //driver class
    public static void main(String[] args) {
        PaymentCalculator paymentCalculator = new PaymentCalculator();

        //get user input
       paymentCalculator.getValues();
        //calculate number of months to pay off balance
        paymentCalculator.calculateMonthsUntilPaidOff();
        //tell the user the number of months
        paymentCalculator.printMonthsUntilPaidOff();
    }
}
