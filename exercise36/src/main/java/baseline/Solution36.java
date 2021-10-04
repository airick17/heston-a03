/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */
package baseline;
public class Solution36 {
    public static void main(String[] args) {
        Computer computer =new Computer();
        computer.promptUser();
        computer.inputMilliseconds();
        computer.calculateValues();
        computer.printValues();
    }
}
