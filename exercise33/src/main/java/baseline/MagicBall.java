package baseline;

import java.util.*;

public class MagicBall {
    //magic ball object stores the users question
    //a string to store the answer
    //user question really doesn't need to be stored but allows for user to type in
    private String userQuestion = "";
    private String answer = "";

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void start(){
        //holds inner methods
        getQuestion();
        getRandomAnswer();
        printAnswer();
    }

    private void getQuestion(){
        //will prompt the user for question
        //stores the users question in class variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your question? ");
        setUserQuestion(scanner.nextLine());
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
        int random = randomNumberGenerator();
        setAnswer(answersList.get(random));
    }

    public int randomNumberGenerator(){
        //will generate a random number 1-4 and return it as int
        Random random = new Random();
        return random.nextInt(4)+1;
    }

    private void printAnswer(){
        //prints random answer to user
        System.out.printf("%n%s%n", getAnswer());
    }
}



