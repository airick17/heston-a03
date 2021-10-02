package baseline;

public class DoubleInvestmentCalculator {
   private double rateOfReturn;
   private int years;

    public void getInvestmentYears() {
        //use try catch block to prompt until user gives proper input
        //can't be (input error exception or something)
        //has to be int or double? if allowed  (mismatch type or something)
            //"Sorry. That is not a valid input"
        //while loop to keep prompting until input is valid
        getRateOfReturnFromUser();

        //divides 72 by rateOfReturn to get years
        calculateYears();

        //prints years to user
        printYears();
    }

    private void getRateOfReturnFromUser() {

    }

    private void calculateYears() {

    }

    private void printYears() {

    }
}
