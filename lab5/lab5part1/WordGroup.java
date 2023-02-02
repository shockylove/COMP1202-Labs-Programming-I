package lab5part1;

import java.util.Locale;

public class WordGroup {
    /**
     * Has an instance variable of type String called words.
     * Has a constructor which takes a String.
     * This is converted into lower case and stored in words.
     * Use a method from the String API to make the string lower case.
     * Has a method called getWordArray() which returns a String[].
     * Use the String class split() method to separate words on " ".*/
    String words;

    public WordGroup(String input) {
        this.words = input.toLowerCase();
    }

    public String[] getWordArray(){
        return words.split(" ");
    }


}
