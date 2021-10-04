/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

package baseline;

public class Solution39 {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortByLastName();
        sorter.printList(sorter.sortByLastName());
    }
}
