package baseline;

import java.util.Scanner;

public class PaymentCalculator {
    double balance;
    double percentageAPR;
    double monthlyPayment;

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPercentageAPR(double percentageAPR) {
        this.percentageAPR = percentageAPR;
    }
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    //round internal calculations to the nearest cent
    public void getValues() {
        Scanner scanner = new Scanner(System.in);
        //get values for equation from user
        System.out.print("What is your balance? ");
        //round up to next cent
        balance = Math.ceil(scanner.nextDouble()*100)/100;
        System.out.print("What is the APR on the card (as a percent)? ");
        percentageAPR = scanner.nextDouble()/100.0;
        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = scanner.nextDouble();
    }

    public double calculateMonthsUntilPaidOff(){
        //perform calculations
        // number of months rounded up to next month's
        double i = percentageAPR/365.0;
        double b = balance;
        double p = monthlyPayment;
        //figure out equation
        double constant = -(1.0/30);
        double numerator = Math.log(1 + b/p *(1 - Math.pow((1 + i),30)));
        double denominator = Math.log(1 + i);

        return (constant * numerator / denominator);
    }

    public void printMonthsUntilPaidOff(){
        //print number of months until paid off
        //cast into int after rounding up to get rid of fractional months
        int months = (int) Math.ceil(calculateMonthsUntilPaidOff());
        System.out.printf("%nIt will take you %d months to pay off this card.%n", months);
    }
}
