/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

/*
get password from user
    use scanner to get password from user
check password for strength
    password check strength
        -check length of string first
            if less than 8 it can be only "very weak" or "weak"
                if only numbers it is very weak
                if only letters it is weak
            if more than 8 it can be only "strong or very strong"
                check for numbers and special characters
                    if letters and numbers it is "strong"
                    if letters numbers and characters it is "very strong"
output to the user the strength of the password
    -very weak
        only numbers
        fewer than 8 characters
    -weak
        only letters
        fewer than 8 characters
    -strong
        letters and at least one number
        more than 8 characters
    -very strong
        letters numbers and characters
        more than 8 characters
 */

import baseline.Password;

public class Solution25 {
    public static void main(String[] args) {
        //creates new password object
        Password password = new Password();
        //gets password from user
        password.retrievePassword();
        //determines password strength
        password.passwordValidator();
        //prints strength of password
        password.printStrength();
    }
}
