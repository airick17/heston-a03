package baseline;
import java.util.Scanner;

public class Password {
    private Scanner scanner = new Scanner(System.in);

    private String password;
    private int strength = 0;

    //generated getters and setters for Password class
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void retrievePassword(){
        //prompts user for password and stores nextLine() as a new password
        //default password strength is 0 or "unknown strength"
    }
    public int passwordValidator(){
        //code that determines password strength
        //and assigns number value 0-4 for
        //(unknown strength, very weak, strong, very strong)
        return strength;
    }
    public void printStrength(){
        //code that uses strength integer to
        //tell the user the corresponding strength of
        //their password with a print statement
    }
}
