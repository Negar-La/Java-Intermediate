package StatelessUnitTesting.src.test.java.com.tsg.unittesting;

import org.junit.jupiter.api.Test;


import static StatelessUnitTesting.src.main.java.com.tsg.unittesting.strings.StringsExerciseF.longestWord;
import static org.junit.jupiter.api.Assertions.*;
class StringsExerciseFTest {
    public StringsExerciseFTest() {
    }

    //longestWord( "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation and 2% butterscotch ripple" ) ->  "perspiration"
    @Test
    public void testLongWord1(){
        String aPhrase = "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation and 2% butterscotch ripple";
        String expectedPhrase = "perspiration";
        assertEquals(expectedPhrase, longestWord(aPhrase)); //no message
    }

    @Test
    public void testLongWord2(){
        String aPhrase = "Today is the happiest day of my life";
        String expectedPhrase = "happiest";
        assertEquals(expectedPhrase, longestWord(aPhrase));
    }

    //longestWord( "All well-established principles should be periodically challenged" ) ->  "well-established"
    @Test
    public void testHyphenated1(){
        String aPhrase = "All well-established principles should be periodically challenged";
        String expectedPhrase = "well-established";
        assertEquals(expectedPhrase, longestWord(aPhrase), "Expected well-established");
    }

    //longestWord( "Today is the happiest day of my life" ) ->  "happiest"
    @Test
    public void testHyphenated2(){
        String aPhrase = "This is a hyphenated-word test";
        String expectedPhrase = "hyphenated-word";
        assertEquals(expectedPhrase, longestWord(aPhrase), "Expected hyphenated-word");
    }

    //longestWord( "Never argue with the data" ) ->  "Never"
    @Test
    public void testTie1(){
        String aPhrase = "Never argue with the data";
        String expectedPhrase = "Never";
        assertEquals(expectedPhrase, longestWord(aPhrase), "Expected Never");
    }

    @Test
    public void testTie2(){
        String aPhrase = "The quick brown fox";
        String expectedPhrase = "quick";
        assertEquals(expectedPhrase, longestWord(aPhrase), "Expected quick");
    }

    @Test
    public void testNoWords(){
        String aPhrase = "";
        String expectedPhrase = "";
        assertEquals(expectedPhrase, longestWord(aPhrase), "Expected empty");
    }

    @Test
    public void testOneWord(){
        String aPhrase = "Hello";
        String expectedPhrase = "Hello";
        assertEquals(expectedPhrase, longestWord(aPhrase), "Expected Hello");
    }

    @Test
    public void testPunctuation(){
        String aPhrase = "I like apples, oranges, and bananas.";
        String expectedPhrase = "oranges";
        assertEquals(expectedPhrase, longestWord(aPhrase), "Expected oranges");
    }
}