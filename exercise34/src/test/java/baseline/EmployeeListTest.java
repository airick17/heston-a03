package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {
    @Test
    void createsOriginalListWithFiveEmployeesTest(){
        EmployeeList list = new EmployeeList();
        list.setEmployeeList();
        list.setPickedEmployee("Chris Jones");
        list.newList();
        int expected = 4;
        int actual = employeeList.size();
        assertEquals(expected, actual);

    }
}