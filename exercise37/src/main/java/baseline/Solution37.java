/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

package baseline;

public class Solution37 {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        passwordGenerator.userSpecifications();
        passwordGenerator.makePassword();
        passwordGenerator.printPassword();

    }
}
