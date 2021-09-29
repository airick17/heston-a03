package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void passwordValidatorTest(){
        //tests very weak condition
        Password password = new Password();
        password.setUsersPassword("23443");
        int expected = 1;
        int actual   = password.passwordValidator(password.usersPassword);
        assertEquals(expected, actual);

        //tests week condition
        password.setUsersPassword("adcdeh");
        expected = 2;
        actual   = password.passwordValidator(password.usersPassword);
        assertEquals(expected, actual);

        //tests strong condition
        password.setUsersPassword("aFczfg32df");
        expected = 3;
        actual   = password.passwordValidator(password.usersPassword);
        assertEquals(expected, actual);

        //tests very strong condition
        password.setUsersPassword("a34dcdDdSS4G#$/3efg");
        expected = 4;
        actual   = password.passwordValidator(password.usersPassword);
        assertEquals(expected, actual);

        //tests unknown condition
        password.setUsersPassword("!!!");
        expected = 0;
        actual   = password.passwordValidator(password.usersPassword);
        assertEquals(expected, actual);
    }

    @Test
    void isOnlyDigitTest(){
        //true condition
        Password password = new Password();
        password.setUsersPassword("23443");
        boolean actual = password.isOnlyDigit(password.getUsersPassword());
        assertTrue(actual);

        //false condition
        password.setUsersPassword("234s43");
        actual = password.isOnlyDigit(password.getUsersPassword());
        assertFalse(actual);

    }
    @Test
    void hasLetterTest(){
        //true condition
        Password password = new Password();
        password.setUsersPassword("2344sad3");
        boolean actual = password.hasLetter(password.getUsersPassword());
        assertTrue(actual);

        //false condition
        password.setUsersPassword("23443");
        actual = password.isOnlyDigit(password.getUsersPassword());
        assertFalse(actual);
    }

    @Test
    void hasDigitTest(){
        //true condition
        Password password = new Password();
        password.setUsersPassword("2344sad3");
        boolean actual = password.hasLetter(password.getUsersPassword());
        assertTrue(actual);

        //false condition
        password.setUsersPassword("asdascSSA");
        actual = password.isOnlyDigit(password.getUsersPassword());
        assertFalse(actual);
    }

    @Test
    void hasSymbolTest(){
        //true condition
        Password password = new Password();
        password.setUsersPassword("234@@/4sad3");
        boolean actual = password.hasLetter(password.getUsersPassword());
        assertTrue(actual);

        //false condition
        password.setUsersPassword("2344asAC3");
        actual = password.isOnlyDigit(password.getUsersPassword());
        assertFalse(actual);
    }

    @Test
    void stringStrengthTest(){
        Password password = new Password();
        password.setUsersPassword("123");
        String test = "very weak";
        String testActual = password.strengthString();
        int bool;
        if(test.equals(testActual)){
            bool = 1;
        }
        else{
            bool = 2;
        }
        int expected = 1;
        int actual = bool;
        assertEquals(expected, actual);
    }
}