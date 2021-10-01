/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

package baseline;

public class Solution27 {
    public static void main(String[] args) {
        Information information = new Information();
        information.getInfo();
        information.validateInput(information);
        information.printValidateInformation();
    }
}
