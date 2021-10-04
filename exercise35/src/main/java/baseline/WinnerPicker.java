package baseline;

import java.util.ArrayList;

public class WinnerPicker {
    //class holds the list of names
    //class holds winner slot
    private ArrayList contestants = new ArrayList();
    private String winner = "";

    public void inputForArray() {
        //Get names of contestants from user
        //adds name to array until user enters " "
    }

    public int pickRandomNumber() {
        //randomly selects a number to use as the winner
        //random range between 0 and array.siz()
        //returns random int
        return 0;
    }

    public void pickWinner(){
        //uses pickRandomNumber() return int as the index number of the winner in the array
        //sets class variable winner to the string at that index
    }

    public void printWinner() {
        //prints the winner class variable to the user
    }
}
