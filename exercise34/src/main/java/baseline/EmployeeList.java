package baseline;

import java.util.*;

public class EmployeeList {
    //contains original list
    //string variable to be set by user
    private String pickedEmployee = "";
    private ArrayList<String> employeeList;

    public EmployeeList() {
        employeeList = new ArrayList<>(5);
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
    }

    public String getPickedEmployee() {
        return pickedEmployee;
    }

    public void setPickedEmployee(String pickedEmployee) {
        this.pickedEmployee = pickedEmployee;
    }

    public void pickEmployee(){
        //let user enter a name
        //find name in list
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nEnter an employee name to be removed: ");
        setPickedEmployee(scanner.nextLine());
    }

    public void newList(){
        //creates new list without the picked employee
        employeeList.remove(getPickedEmployee());
    }

    public void printList(){
        //prints list of names out
        int listSize = employeeList.size();
        System.out.printf("%nThere are %d employees:%n", listSize);
        for (Object o : employeeList)
            System.out.println(o);
    }
}
