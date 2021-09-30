/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

public class Solution26 {
    //driver class
    public static void main(String[] args) {
        //get user input
        PaymentCalculator.getValues();
        //calculate number of months to pay off balance
        PaymentCalculator.calculateMonthsUntilPaidOff();
        //tell the user the number of months
        PaymentCalculator.printMonthsUntilPaidOff();
    }
}
