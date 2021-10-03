package baseline;
import java.util.*;

class TargetHeartRateCalc {
    private int age;
    private int restingPulse;
    private int intensity = 55;

    public int getIntensity() {
        return intensity;
    }
    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRestingPulse(int restingPulse) {
        this.restingPulse = restingPulse;
    }
    public int getAge() {
        return age;
    }
    public int getRestingPulse() {
        return restingPulse;
    }

    protected void getValidInput() {
        //sets a valid resting pulse and age for the TargetHeartRateCalc
        setRestingPulse(getTempRestingPulse());
        setAge(getTempAge());
    }

    private static int getTempRestingPulse() {
        //method that gets a valid number for resting pulse
        int tempRestingPulse = 0;
        boolean keepGoing = true;
        do{
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.print("What your resting heart rate? ");
                tempRestingPulse = scanner.nextInt();
                keepGoing = false;
            } catch (InputMismatchException e){
                System.out.println("Sorry. That is not a valid input. ");
            }
        } while(keepGoing);
        return tempRestingPulse;
    }

    private static int getTempAge() {
        //method that gets a valid number for age
        int tempAge = 0;
        boolean keepGoing = true;
        do{
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.print("What your age? ");
                tempAge = scanner.nextInt();
                keepGoing = false;
            } catch (InputMismatchException e){
                System.out.println("Sorry. That is not a valid input. ");
            }
        } while(keepGoing);
        return tempAge;
    }
    public int calculateRate(){
        //will take the current intensity and use it in Target Heart Rate formula
        //returns int for bpm
        double bpm  = ((((220 - getAge()) - getRestingPulse()) * (getIntensity()*.01)) + getRestingPulse());
        return (int) Math.round(bpm);
    }

    public void printResults() {
        //prints out table of heart rate targets
        int currentIntensity = getIntensity();
        System.out.printf("%nResting Pulse: %d        Age: %d %n",getRestingPulse(), getAge());
        System.out.printf("%n%s %8s", "Intensity", "| Rate");
        System.out.printf("%n------------|----------");
        for(int i = currentIntensity; i<=95; i+=5){

            System.out.printf("%n%d%%  \t\t|%4d bpm",currentIntensity, calculateRate());
            setIntensity(currentIntensity+5);
            currentIntensity += 5;
        }
        System.out.println();

    }

}

