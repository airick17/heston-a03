/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

//class called total with 5 ints
//method getNumbers
    //for loop 1-5
        //prompts user for number
        //sets nextLine = to i
        //i++

//method addTotal
    //int total
    //for loop 1-5
        //total = total + i;

//method printTotal
    //print total to user

package baseline;

public class Solution28 {
    public static void main(String[] args) {
        Total total = new Total();
        total.getNumbers();
        total.printTotal();
    }
}
