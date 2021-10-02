package baseline;

import java.util.*;

public class DoubleInvestmentCalculator {

    private int years;

    public void setYears(int years) {
        this.years = years;
    }
    public int getYears() {
        return years;
    }

    public void getInvestmentYears() {
        getRateOfReturnFromUser();
        printYears();
    }

    public void getRateOfReturnFromUser() {
        //use try catch block to prompt until user gives proper input
        //can't be (input error exception or something)
        //has to be int or double? if allowed  (mismatch type or something)
        //"Sorry. That is not a valid input"
        //while loop to keep prompting until input is valid
        //returns valid input

        int tempYears = 0;
        boolean keepGoing = true;
        do{
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.print("What is the rate of return? ");
                tempYears = 72 / scanner.nextInt();
                keepGoing = false;
            } catch (InputMismatchException | ArithmeticException e1){
                System.out.println("Sorry. That is not a valid input. ");
            }
        } while(keepGoing);
        //rounds up to the next year
        double tempYearsDouble =  Math.ceil(tempYears);
        setYears((int) tempYearsDouble);
    }

    private void printYears() {
        System.out.printf("It will take %s years to double your initial investment.%n", getYears());
    }
}
