package baseline;

public class PasswordGenerator {
    private int minLength;
    private int numSpecials;
    private int numNums;
    private String password = "";

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getNumSpecials() {
        return numSpecials;
    }

    public void setNumSpecials(int numSpecials) {
        this.numSpecials = numSpecials;
    }

    public int getNumNums() {
        return numNums;
    }

    public void setNumNums(int numNums) {
        this.numNums = numNums;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void userSpecifications() {
        //ask user for minimum length
        //setMinLength
        //ask user for number of special characters
        //setNumSpecials
        //ask user for number of numbers
        //setNumNums
    }

    public String makePassword() {
        //make a char array with length equal to minLength
        //use random string generator with rules
        //must include number of special characters equal numSpecials
        //must include number of numbers equal to numNums
        //set random generated password to password
        return getPassword();
    }

    public void printPassword() {
        //use getPassword to make a string to print
    }
}
