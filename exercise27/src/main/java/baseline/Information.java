package baseline;

public class Information {
   private String firstName;
   private String lastName;
   private String employeeID;
   private int zipcode;

    //need getters and setters
    //change methods from public

    public void getInfo(){
        //get values from the user using scanner and sets class variables appropriately
    }
    public void validateInput(Information information) {
        //takes an Information object and check that inputs are valid
        information.validateFirstName();
        information.validateLastName();
        information.validateEmployeeID();
        information.validateZipcode();
    }
    public void validateFirstName(){
        //checks firstName is filled in, a string of 2 or more chars, and is a string value
    }
    public void validateLastName(){
        //checks lastName is filled in, string of 2 or more chars, and a string value
    }
    public void validateEmployeeID(){
        //checks employeeID is a string in format AA-1234
    }
    public void validateZipcode(){
        //checks that zipcode is type int
    }
    public void printValidateInformation(){
        //prints output to user if the inputs are not valid
        //says there were no errors found if they are
        //System.out.System.out.printf();
    }
}

