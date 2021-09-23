/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Eric Heston
 */

//get the strings from the user
    //prompt for string1
        //store string1
    //prompt for string2
        //store string 2

//boolean return true or false isAnagram

//compare the strings:

    //check if the strings are anagrams:
        //check if the strings have the same amount of characters
            //if they don't have same numbers characters they are not anagrams

        //check if the characters of each anagram are the same:
                //use sort feature to sort the anagrams alphabetically
                 //compare the sorted anagrams
                    //if each character is are equal they are anagrams
                    //if not they are not anagrams

//output the message saying anagram or not

//----------------------------------------------------------------------

//boolean isAnagram(string1, string2)

    //get rid of whitespace
    //string1 = string1.replaceAll("\\s","");
    //string2 = string2.replaceAll("\\s","");

    //check to see if they are same length strings:
    //int str1 = string1.length();
    //int str2 = string2.length();
    //if str1 != str2
        //return false;

    //now if they are same length sort them alphabetically:
    //put each strong into a character array and convert to lowercase
    //char[] array1 = string1.toLowerCase().toCharArray();
    //char[] array2 = string2.toLowerCase().toCharArray();
    //sort the arrays alphabetically
    //Array.sort(array1);
    //Array.sort(array2);

    //if the characters are the same in each position they are anagrams
    //for (i = 0; i<str1; i++;)
        //if(array1[i] != array2[i])
            //return false;

    //if this passes isAnagram is true
    //return true;
//------------------------------------------------------------------------------------
package baseline;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        if(Anagram.isAnagram(string1,string2))
            System.out.printf("\"%s\" and \"%s\" are anagrams.", string1, string2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", string1, string2);
    }
}
