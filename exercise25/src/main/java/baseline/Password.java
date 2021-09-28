package baseline;
import java.util.Scanner;

public class Password {
    protected String usersPassword;
    private int strength;

    //generated getters and setters for Password class
    private void setStrength(int strength) {
        this.strength = strength;
    }
    private void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }
    public String getUsersPassword() {
        return usersPassword;
    }

    public void retrievePassword() {
        //prompts user for password and stores nextLine() as a new password
        //default password strength is 0 or "unknown strength"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        setUsersPassword(scanner.nextLine());
    }

    public int passwordValidator(String usersPassword) {
        //code that determines password strength
        //and assigns number value 1-4 for
        //(very weak, weak, strong, very strong)
        //first check string length if under 8 chars it can only be weak or very weak
        setUsersPassword(usersPassword);
        int length = usersPassword.length();
        if(length < 8){
            checkWeakStrength();
        }
        else{
            checkStrongStrength();
        }
        return strength;
    }

    //if the password is less than 8 chars it can only be weak or very weak
    //this checks to see if its only numbers
    //if it is it sets strength to "very weak" (1) otherwise it is set to "weak" (2)
    private void checkWeakStrength(){
        this.usersPassword = getUsersPassword();

        if(isOnlyDigit(this.usersPassword)){
            setStrength(1);
        }
        else{
            setStrength(2);
        }
    }

    //checks passwords over 8 chars
    //if it has a letter number and symbol it is a very strong password
    // if it has just a letter and number it is a strong password
    //all other conditions fall into unknown strength category
    private void checkStrongStrength(){
        this.usersPassword = getUsersPassword();
        if(hasLetter(this.usersPassword) && hasDigit(this.usersPassword) && hasSymbol(this.usersPassword)){
            setStrength(4);
        }
        else{
            if(hasLetter(this.usersPassword) && hasDigit(this.usersPassword)){
                setStrength(3);
            }
            else{
                setStrength(0);
            }
        }
    }

    //checks the password for only digits and returns true if only digits
    private boolean isOnlyDigit(String usersPassword) {
        int length = usersPassword.length();
        int i = 0;
        while(i < length){
            if(getUsersPassword().charAt(i) >= '0' && getUsersPassword().charAt(i) <= '9'){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }

    //checks if string contains at least 1 letter
    private boolean hasLetter(String usersPassword){
        int length = usersPassword.length();
        int i = 0;
        while(i < length){
            if(getUsersPassword().charAt(i) >= 'A' && getUsersPassword().charAt(i) <= 'Z'){
                return true;
            }
            else if(getUsersPassword().charAt(i) >= 'a' && getUsersPassword().charAt(i) <= 'z'){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }

    //checks if string contains at least 1 number
    private boolean hasDigit(String usersPassword){
        int length = usersPassword.length();
        int i = 0;
        while(i < length){
            if(getUsersPassword().charAt(i) >= '0' && getUsersPassword().charAt(i) <= '9'){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }

    //checks if string contains at least 1 symbol
    private boolean hasSymbol(String usersPassword){
        int length = usersPassword.length();
        int i = 0;
        while(i < length){
            if(getUsersPassword().charAt(i) >= '!' && getUsersPassword().charAt(i) <= '/'){
                return true;
            }
            else if(getUsersPassword().charAt(i) >= ':' && getUsersPassword().charAt(i) <= '@'){
                return true;
            }
            else if(getUsersPassword().charAt(i) >= '[' && getUsersPassword().charAt(i) <= '`'){
                return true;
            }
            else if(getUsersPassword().charAt(i) >= '{' && getUsersPassword().charAt(i) <= '~'){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }

    //method that takes strength and converts it to proper string form
    private String strengthString(){
        String stringStrength = "";
        switch (passwordValidator(usersPassword)) {
            case 1 -> stringStrength = "very weak";
            case 2 -> stringStrength = "weak";
            case 3 -> stringStrength = "strong";
            case 4 -> stringStrength = "very strong";
            default -> {
            }
        }
        return stringStrength;
    }

    public void printStrength(){
        //code that uses strength integer to
        //tell the user the corresponding strength of
        //their password with a print statement
        if(strength == 0){
            System.out.printf("%nThe password '%s' is of unknown strength.%n", usersPassword);
            return;
        }
        System.out.printf("%nThe password '%s' is a %s password.%n", usersPassword, strengthString());
    }
}
