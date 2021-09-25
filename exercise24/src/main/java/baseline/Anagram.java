package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //scanner for anagram class
    static Scanner scanner = new Scanner(System.in);

    //class variables
    static String string1;
    static String string2;

    //getters and setters
    public static String getString1() {
        return string1;
    }
    public static void setString1(String string1) {
        Anagram.string1 = string1;
    }
    public static String getString2() {
        return string2;
    }
    public static void setString2(String string2) {
        Anagram.string2 = string2;
    }

    //uses the scanner class to get two words from the user
    public static void getUserInput() {
        System.out.print("Enter the first string: ");
        String firstWord = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondWord = scanner.nextLine();

        //sets the anagram object strings to the users input
        Anagram.setString1(firstWord);
        Anagram.setString2(secondWord);
    }

    //if isAnagram is true print the first string if false print the second string
    public static void printResults(Anagram anagram){
        if (isAnagram(getString1(),getString2()))
            System.out.printf("\"%s\" and \"%s\" are anagrams.", string1, string2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", string1, string2);
   }

   //method that actually compares the two words
    public static boolean isAnagram(String string1, String string2){
        //get rid of whitespace
        string1 = string1.replaceAll("\\s","");
        string2 = string2.replaceAll("\\s","");

        //check to see if they are same length strings:
        int str1 = string1.length();
        int str2 = string2.length();
        if(str1 != str2)
            return false;

        //if they are same length sort them alphabetically:
        //put each strong into a character array and convert to lowercase
        char[] array1 = string1.toLowerCase().toCharArray();
        char[] array2 = string2.toLowerCase().toCharArray();

        //sort the arrays alphabetically
        Arrays.sort(array1);
        Arrays.sort(array2);

        //if the characters are the same in each position they are anagrams
        for (int i=0;i<str1;i++){
            if(array1[i] != array2[i])
                return false;
        }

        return true;
    }
}
