package lab5part2;

import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {
    //part1
    String words;

    public WordGroup(String input) {
        this.words = input.toLowerCase();
    }

    String[] getWordArray(){
        return words.split(" ");
    }

    // part2
    HashSet<String> getWordSet(WordGroup group){
        HashSet<String> hs ;
        hs = new HashSet<>();

        String[] thisWords = this.getWordArray();
        String[] parameterWords = group.getWordArray();

        //for each loop : for(type var : array){...}
        for(String fromWords: thisWords)
        {
            hs.add(fromWords);
        }
        for(String fromParameter : parameterWords)
        {
            hs.add(fromParameter);
        }
        return hs;
    }


}
