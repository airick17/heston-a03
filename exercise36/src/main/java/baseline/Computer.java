package baseline;

import java.util.ArrayList;

public class Computer {
    //class holds a array that will be populated by user data
    static final ArrayList websiteData = new ArrayList();
    //Hold doubles for computations
    private double average;
    private double max;
    private double min;
    private double std;

    public double getAverage() {
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    public double getMax() {
        return max;
    }
    public void setMax(double max) {
        this.max = max;
    }
    public double getMin() {
        return min;
    }
    public void setMin(double min) {
        this.min = min;
    }
    public double getStd() {
        return std;
    }
    public void setStd(double std) {
        this.std = std;
    }

    public void promptUser() {
        //asks user for milliseconds
    }

    public void inputMilliseconds() {
        //sets class array with user input
        //loop getValue until user enters "done"
            //check each input for "done" before putting it in the array
        //this array is final it cannot be modified after
    }

    public void calculateValues() {
        //either loops the array or uses array function to perform math calculations
        setAverage(average());
        setMax(max());
        setMin(min());
        setStd(std());
    }

    public double average(){
        //averages array
        return 0;
    }

    public double max(){
        //finds max array
        return 0;
    }

    public double min(){
        //finds min array
        return 0;
    }

    public double std(){
        //finds standard deviation of array
        return 0;
    }

    public void printValues() {
        //prints the calculations to the user
    }
}
