package baseline;

import java.util.InputMismatchException;
import java.util.*;

public class Game {
   private int difficulty;
   private int randomNumber;
   private int guessesCounter;

    public int getDifficulty() {
        return difficulty;
    }
    public int getRandomNumber() {
        return randomNumber;
    }
    public int getGuessesCounter() {
        return guessesCounter;
    }
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
    public void setGuessesCounter(int guessesCounter) {
        this.guessesCounter = guessesCounter;
    }

    public void selectDifficulty() {
        //gets valid difficulty from user only accepts 1, 2, or 3
        //can't accept string
    }

    public void calcRandomNumber(){
        //generates a random number using math.random prob
        //if difficulty is 1 then random num 1 - 10
        //if difficulty is 1 then random num 1 - 100
        //if difficulty is 1 then random num 1 - 1000
        //sets random num class variable
    }

    public void countGuess(){
        //adds +1 to guess counter each guess
        //setGuessesCounter(guessesCounter++);
    }

    public void playGame(){
        //prob a while loop while(tempGuess != getRandomNumber())

        //takes users guess
        //checks users guess appropriately based on difficulty
        //prints appropriate statement

       int tempRandomNumber = getRandomNumber();
       int tempGuess;

        checkNumber();
    }

    public void checkNumber() {
        //check if users guess is same as random num
    }


    public void firstPrompt(){
        //tells user that random number has been calculated
        //prompt to start guessing
    }

    public void print() {
        //welcome message
        //will probably need various print blocks
        //print when user is too high
        //print when user is too low
        //print when they guess the right num
        //print number of total guesses at the end
    }

    public void playAgain(){
        //ask user if they want to play again
        //if yes call playGame();
        //else end program
    }
}
