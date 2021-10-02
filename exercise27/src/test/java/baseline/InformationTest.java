package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformationTest {

    @Test
    void validateFirstNameTest() {
        Information informationTest = new Information();
        informationTest.setFirstName("Eric");
        boolean actual = informationTest.validateFirstName();
        assertTrue(actual);
    }

    @Test
    void validateFirstNameLengthTest() {
        Information informationTest = new Information();
        informationTest.setFirstName("Eric");
        boolean actual = informationTest.validateFirstNameLength();
        assertTrue(actual);
    }

    @Test
    void  validateLastNameTest(){
        Information informationTest = new Information();
        informationTest.setLastName("Heston");
        boolean actual = informationTest.validateLastName();
        assertTrue(actual);

    }

    @Test
    void  validateLastNameLengthTest(){
        Information informationTest = new Information();
        informationTest.setLastName("Heston");
        boolean actual = informationTest.validateLastNameLength();
        assertTrue(actual);
    }

    @Test
    void validateEmployeeIDTest(){
        Information informationTest = new Information();
        informationTest.setEmployeeID("AA-1232");
        boolean actual = informationTest.validateEmployeeID();
        assertTrue(actual);
    }

    @Test
    void validateZipcodeTest(){
        Information informationTest = new Information();
        informationTest.setZipcode("12345");
        boolean actual = informationTest.validateZipcode();
        assertTrue(actual);
    }
}
