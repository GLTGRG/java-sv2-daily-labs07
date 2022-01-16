package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human = new Human("John Doe", 1999);

    @Test
    void isNameValidTest(){
        boolean result = human.isNameValid("John Doe");

        assertTrue(result);
    }

    @Test
    void isNameValidWithNullTest(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class, ()-> human.isNameValid(null));
        assertEquals("name is invalid", iae.getMessage());
    }

    @Test
    void isNameValidWithWrongNameTest(){
        IllegalArgumentException iae=assertThrows(IllegalArgumentException.class, ()-> human.isNameValid("John"));
        assertEquals("name is invalid", iae.getMessage());
    }

    @Test
    void isYearOfBirthTest(){
        assertTrue(human.isYearOfBirthValid(1901));
    }

    @Test
    void isYearOfBirthValidWithWrongParamTest(){
        assertThrows(IllegalArgumentException.class, ()->human.isYearOfBirthValid(1900));
    }

    @Test
    void crateHumanWithWrongYear(){
        assertThrows(IllegalArgumentException.class, ()-> new Human("John Doe", 1900));
    }

}