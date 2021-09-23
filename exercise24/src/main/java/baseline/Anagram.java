package baseline;

import java.util.Arrays;

class Anagram {
     static boolean isAnagram(String string1, String string2){
        //get rid of whitespace
        string1 = string1.replaceAll("\\s","");
        string2 = string2.replaceAll("\\s","");
        //check to see if they are same length strings:
        int str1 = string1.length();
        int str2 = string2.length();
        if(str1 != str2)
            return false;
        //now if they are same length sort them alphabetically:
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
        //if this passes isAnagram is true
        return true;
    }

}
