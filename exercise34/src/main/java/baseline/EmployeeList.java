package baseline;

import java.util.*;

public class EmployeeList {
    //contains original list
    //string variable to be set by user
    private List<String> employeeList = new ArrayList<>();
            employeeList.add("John Smith");
            employeeList.add("Jackie Jackson");
            employeeList.add("Chris Jones");
            employeeList.add("Amanda Cullen");
            employeeList.add("Jeremy Goodwin");

    private String pickedEmployee = "";

    public String getPickedEmployee() {
        return pickedEmployee;
    }

    public void setPickedEmployee(String pickedEmployee) {
        this.pickedEmployee = pickedEmployee;
    }

    public void pickEmployee(){
        //let user enter a name
        //find name in list
    }

    public void newList(){
        //creates new list without the picked employee
    }

    public void printList(){
        //prints list of names out
    }
}
