/**
 * The SentenceProcessor class provides methods for removing duplicated words and replacing words in a sentence.
 * Words are separated by white spaces, and the methods are case-sensitive.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class SentenceProcessor {

    /**
     * Removes all duplicated words in a given sentence and returns the modified sentence.
     *
     * @param sentence the input sentence to process
     * @return the modified sentence with duplicated words removed
     */
    public static String removeDuplicatedWords(String sentence) {
        String words[] = sentence.split(" "); // split sentence into an array of words
        List<String> process_arr = new ArrayList<String>(); // create a new list to store the processed words

        for (String token : words) {
            if (!process_arr.contains(token)) { // if the list does not already contain the word
                process_arr.add(token); // add it to the list
            }
        }

        String delimiter = " "; // specify the delimiter
        String output = String.join(delimiter, process_arr); // join the list of processed words into a string
        return output;
    }

    /**
     * Replaces all occurrences of a given word in a given sentence with another given word, and returns the modified sentence.
     *
     * @param target      the word to be replaced
     * @param replacement the word to replace the target word
     * @param sentence    the input sentence to process
     * @return the modified sentence with all occurrences of the target word replaced by the replacement word
     */
    public static String replaceWord(String target, String replacement, String sentence) {
        String words[] = sentence.split(" "); // split sentence into an array of words
        List<String> process_arr = new ArrayList<String>(); // create a new list to store the processed words

        for (String token : words) {
            if (token.equals(target)) { // if the word matches the target word
                process_arr.add(replacement); // add the replacement word to the list
                continue; //  directly move on to the next word
            }
            process_arr.add(token); // if the word is not the target word, add it to the list
        }

        String delimiter = " "; // specify the delimiter
        String output = String.join(delimiter, process_arr); // join the list of processed words into a string
        return output;
    }
}
