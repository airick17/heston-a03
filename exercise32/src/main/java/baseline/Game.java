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
        boolean keepGoing = true;
        int tempDifficulty = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                tempDifficulty = scanner.nextInt();
                keepGoing = false;
            } catch (InputMismatchException e) {
                System.out.println("Sorry. That is not a valid input. ");
            }
        } while (keepGoing);
        if(tempDifficulty > 3 || tempDifficulty <= 0){
            System.out.printf("Please select an available difficulty, %d is not valid. %n", tempDifficulty);
            selectDifficulty();
        }
        else{
            setDifficulty(tempDifficulty);
        }
    }

    public int calcRandomNumber(){
        //generates a random number using math.random prob
        //if difficulty is 1 then random num 1 - 10
        //if difficulty is 1 then random num 1 - 100
        //if difficulty is 1 then random num 1 - 1000
        //sets random num class variable
        Random random = new Random();
        int tempRandomNumber = 0;
        int min = 1;
        int max;

        if(getDifficulty() == 1){
            max = 10;
            tempRandomNumber = random.nextInt(max - min + 1) + min;
        }
        else if(getDifficulty() == 2){
            max = 100;
            tempRandomNumber = random.nextInt(max - min + 1) + min;
        }
        else if(getDifficulty() == 3){
            max = 1000;
            tempRandomNumber = random.nextInt(max - min + 1) + min;
        }
        return tempRandomNumber;
    }

    public void playGame(){
        //prob a while loop while(tempGuess != getRandomNumber())
        //takes users guess
        //checks users guess appropriately based on difficulty
        //prints appropriate statement
        selectDifficulty();
        setRandomNumber(calcRandomNumber());
        System.out.print("I have my number. What's your guess? ");
        checkNumber(getValidGuess());
        if(checkPlayAgain()){
            playGame();
        }
        else{
            System.exit(0);
        }
    }

    private int getValidGuess() {
        boolean keepGoing = true;
        int tempGuess = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                //System.out.print("What's your guess? ");
                tempGuess = scanner.nextInt();
                setGuessesCounter(getGuessesCounter()+1);
                keepGoing = false;
            } catch (InputMismatchException e) {
                System.out.print("Sorry. That is not a valid input. Guess again:  ");
                setGuessesCounter(getGuessesCounter()+1);
            }
        } while (keepGoing);
        return tempGuess;
    }

    public void checkNumber(int guess) {
        //check if users guess is same as random num
        if(getRandomNumber() == guess){
            System.out.printf("You got it in %d guesses! Do you wish to play again? (Y/N)?%n", getGuessesCounter());
            checkPlayAgain();
        }
        else if(getRandomNumber() < guess){
                System.out.print("Too high. Guess again: ");
                checkNumber(getValidGuess());
            }
            else if (getRandomNumber() > guess){
                System.out.print("Too low. Guess again: ");
                checkNumber(getValidGuess());
            }
        }

    public boolean checkPlayAgain(){
        //ask user if they want to play again
        //if yes call playGame();
        //else end program
        Scanner scan = new Scanner(System.in);
        String yesOrNo = scan.next();

        if (yesOrNo.equals("n")||yesOrNo.equals("N")){
            return false;
        }
        else if (yesOrNo.equals("y")||yesOrNo.equals("Y")){
            return true;
        }
        else {
            System.out.print("Not a valid input, game now terminating");
            return false;
        }
    }
}
