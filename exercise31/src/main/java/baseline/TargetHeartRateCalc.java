package baseline;
import java.util.*;

class TargetHeartRateCalc {
   private int age;
   private int restingPulse;

    public void setAge(int age) {
        this.age = age;
    }
    public void setRestingPulse(int restingPulse) {
        this.restingPulse = restingPulse;
    }

    protected void getValidInput() {
        //sets a valid resting pulse and age for the TargetHeartRateCalc
        setRestingPulse(getTempRestingPulse());
        setAge(getTempAge());
    }

    private static int getTempRestingPulse() {
        //method that gets a valid number for resting pulse
        return 0;
    }

    private static int getTempAge() {
        //method that gets a valid number for age
        return 0;
    }

    public void printResults() {
        //prints out table of heart rate targets
    }
}
