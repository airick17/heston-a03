package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        //tests isAnagram function
        Anagram anagram = new Anagram();

        //tests if isAnagram is false
        //should pass this test
        Anagram.setString1("bob");
        Anagram.setString2("mary");
        boolean expected = false;
        boolean actual = Anagram.isAnagram(Anagram.getString1(), Anagram.getString2());
        assertEquals(expected, actual);

        //tests if isAnagram is true
        //should pass this test
        Anagram.setString1("top");
        Anagram.setString2("pot");
        expected = true;
        actual = Anagram.isAnagram(Anagram.getString1(), Anagram.getString2());
        assertEquals(expected, actual);
    }
}