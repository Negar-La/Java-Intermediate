package StatelessUnitTesting.src.test.java.com.tsg.unittesting;

import org.junit.jupiter.api.Test;

import static StatelessUnitTesting.src.main.java.com.tsg.unittesting.strings.StringsExerciseE.containsTheOther;
import static org.junit.jupiter.api.Assertions.*;
class StringsExerciseETest {
    public StringsExerciseETest() {
    }

    //containsTheOther( "one", "tone" ) ->  true
    @Test
    public void containsTrue(){
        String firstString = "one";
        String secondString = "tone";
        boolean result = containsTheOther(firstString, secondString);
        assertTrue(result, "tone contains one");
    }

    //containsTheOther( "same", "same" ) ->  false
    @Test
    public void containsExactlyEqual(){
        String firstString = "same";
        String secondString = "same";
        boolean result = containsTheOther(firstString, secondString);
        assertFalse(result, "two strings are identical");
    }

    //containsTheOther( "fancypants", "pants" ) -> true
    @Test
    public void containsTrue2(){
        String firstString = "fancypants";
        String secondString = "pants";
        boolean result = containsTheOther(firstString, secondString);
        assertTrue(result, "fancypants contains pants");
    }

    //containsTheOther( "apple", "app" ) -> true
    @Test
    public void containsTrue3(){
        String firstString = "apple";
        String secondString = "app";
        boolean result = containsTheOther(firstString, secondString);
        assertTrue(result, "apple contains app");
    }

    //containsTheOther( "llama", "duck" ) ->  false
    @Test
    public void containsFalse(){
        String firstString = "llama";
        String secondString = "duck";
        boolean result = containsTheOther(firstString, secondString);
        assertFalse(result, "llama does not contain duck");
    }

    //containsTheOther( "apple", "banana" ) ->  false
    @Test
    public void containsFalse2(){
        String firstString = "apple";
        String secondString = "banana";
        boolean result = containsTheOther(firstString, secondString);
        assertFalse(result, "The two strings have some common characters but are not substrings of each other. apple does not contain banana");
    }

    //containsTheOther( "", "" ) ->  false
    @Test
    public void containsEmpty(){
        String firstString = "";
        String secondString = "";
        boolean result = containsTheOther(firstString, secondString);
        assertFalse(result, "Both strings are empty, so they are exactly equal");
    }

    //containsTheOther( "", "world" ) ->  true
    @Test
    public void containsTrueWithOneEmpty(){
        String firstString = "";
        String secondString = "world";
        boolean result = containsTheOther(firstString, secondString);
        assertTrue(result, " an empty string is considered to be contained in any non-empty string");
    }
}