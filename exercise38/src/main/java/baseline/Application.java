package baseline;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Application {
    //stores string of nums separated by space
    private String userStringNums = "";

    public String getUserStringNums() {
        return userStringNums;
    }
    public void setUserString(String userString) {
        this.userStringNums = userString;
    }

    public void userString() {
        //ask user to enter list of numbers separated by a space
        //store this entire thing as the class variable userStringNums
    }
    public ArrayList makeArray() {
        //turns string with white spaces into array
        //returns array of nums

        //adds number from String into array element until it finds a white space
        //when it finds a white space it skips on char and then starts filling in next array element
        ArrayList numberArray = new ArrayList<>();

        return numberArray;
    }

    public void printEvenNumbers() {
        getEvenNums();
        //prints evenNums to user
    }

    private ArrayList getEvenNums() {
        //finds the even numbers in the array
        //creates a new array with only those nums
        //returns even array
        return null;
    }
}
