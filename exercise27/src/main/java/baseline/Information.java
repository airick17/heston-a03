package baseline;

import java.util.Scanner;

public class Information {
    private String firstName = "";
    private String lastName = "";
    private String employeeID = "";
    private String zipcode = "";

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    //change methods from public
    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        //get values from the user using scanner and sets class variables appropriately
        System.out.print("Enter the first name: ");
        setFirstName(scanner.nextLine());

        System.out.print("Enter the last name: ");
        setLastName(scanner.nextLine());

        System.out.print("Enter the ZIP code: ");
        setZipcode(scanner.nextLine());

        System.out.print("Enter the employee ID: ");
        setEmployeeID(scanner.next());
    }

    public void validateInput(Information information) {
        //takes an Information object and check that inputs are valid
        information.validateFirstName();
        information.validateLastName();
        information.validateZipcode();
        information.validateEmployeeID();
    }

    public boolean validateFirstName() {
        //checks lastName is filled in, string of 2 or more chars, and a string value
        if (firstName.length() == 0) {
            return false;
        }
        return true;
    }

    public boolean validateFirstNameLength() {
        //checks lastName is filled in, string of 2 or more chars, and a string value
        if (firstName.length() < 2) {
            return false;
        }
        return true;
    }

    public boolean validateLastName() {
        //checks lastName is filled in, string of 2 or more chars, and a string value
     if (lastName.length() == 0 ){
            return false;
        }
        return true;
    }

    public boolean validateLastNameLength() {
        //checks lastName is filled in, string of 2 or more chars, and a string value
        if (lastName.length() < 2) {
            return false;
        }
        return true;
    }

    public boolean validateEmployeeID() {
        //checks employeeID is a string in format AA-1234
        if (employeeID.length() - 1 != 6) {
            return false;
        }
        else if (employeeID.toCharArray()[2] != '-') {
            return false;
        }
        else if (Character.isLetter(employeeID.toCharArray()[0] & employeeID.toCharArray()[1])) {
            return true;
        }
        else if (Character.isDigit(employeeID.toCharArray()[3] & employeeID.toCharArray()[4]
                & employeeID.toCharArray()[5] & employeeID.toCharArray()[6])) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean validateZipcode() {
        if(zipcode.length() != 5){
            return false;
        }
        else if(!Character.isDigit(zipcode.toCharArray()[0] & zipcode.toCharArray()[1]
                & zipcode.toCharArray()[2] & zipcode.toCharArray()[3] & zipcode.toCharArray()[4])){
            return false;
        }

        return true;
    }

    public void printValidateInformation()  {
        //prints output to user if the inputs are not valid
        //says there were no errors found if they are
        //System.out.System.out.printf();

        if(!validateFirstName()){
            System.out.println("The first name must be filled in");
        }
        if(!validateFirstNameLength()){
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(!validateLastName()){
            System.out.println("The last name must be filled in");
        }
       if(!validateLastNameLength()){
           System.out.println("The last name must be at least 2 characters long.");
       }
        if(!validateZipcode()){
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if (!validateEmployeeID()){
            System.out.println("The employee ID must be in the format of AA-1234.");
        }

        if(validateFirstName() && validateFirstNameLength() && validateLastName() && validateLastNameLength()
            && validateZipcode() && validateEmployeeID()){
            System.out.println("There were no errors found.");
        }
    }
}
