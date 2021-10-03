package baseline;

import java.util.*;

public class MagicBall {
    //magic ball object stores the users question
    //a string to store the answer

    private String userQuestion = "";
    private String answer = "";

    public void start(){
        //holds inner methods
        getUserQuestion();
        getRandomAnswer();
        printAnswer();
    }

    private void getUserQuestion(){
        //will prompt the user for question
        //stores the users question in class variable
    }

    private void getRandomAnswer(){
        //final list of answers that will be randomly given back to the user
        //call get random number method 1-4
        //store random number as int
        //use random number to pick corresponding random answer
        //set class variable answer to the random answer
        final List<String> answersList = new ArrayList<>();
        answersList.add("Yes");
        answersList.add("No");
        answersList.add("Maybe");
        answersList.add("Ask again later.");

    }

    private int randomNumberGenerator(){
        //will generate a random number 1-4 and return it as int
        return 0;
    }

    private void printAnswer(){
        //prints random answer to user
    }
}



