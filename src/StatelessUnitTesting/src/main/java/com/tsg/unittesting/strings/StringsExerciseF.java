/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package StatelessUnitTesting.src.main.java.com.tsg.unittesting.strings;
import java.util.regex.Pattern;
/**
 *
 * @author ahill
 */
public class StringsExerciseF {
    
    /**
     * Take in a phrase that has many words separated by spaces. 
     * Return the longest word that you can find within the phrase - 
     * don't forget, hyphenated words are allowed!
     *
     * If there is a tie, return the first instance of a word of that size.
     *
     * Ex:
     * longestWord( "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation and 2% butterscotch ripple" ) ->  "perspiration"
     * longestWord( "All well-established principles should be periodically challenged" ) ->  "well-established"
     * longestWord( "Never argue with the data" ) ->  "Never"
     * 
     * @param aPhrase
     * @return String word
     */

    //first version of my code without consideration of punctuation.
    /*
    public static String longestWord(String aPhrase){
       String[] words = aPhrase.split(" ");
       String maxLengthWord = "";

       for(int i = 0; i < words.length; i++){
           if(words[i].length() > maxLengthWord.length()){
               maxLengthWord = words[i];
           }
       }
        return maxLengthWord;
    }

     */


    public static String longestWord(String aPhrase) {
        String[] words = aPhrase.split(" ");
        String maxLengthWord = "";

        for (int i = 0; i < words.length; i++) {
            // Remove punctuation marks using regular expressions
            String word = words[i].replaceAll("[^a-zA-Z0-9-]", ""); // to remove any character that is not a letter, digit, or hyphen

            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
            }
        }
        return maxLengthWord;
    }

}
