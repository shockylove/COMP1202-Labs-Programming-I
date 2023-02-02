package lab5part3;

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

    //part3
    HashMap<String,Integer> getWordCounts(){
        HashMap<String,Integer> hm;
        hm = new HashMap<>();
        String[] hmWord = this.getWordArray();
        //功能：把每个单词计数————hashmap单词和次数
        //单词：利用已有array赋值
        //次数：每多出一次就+1————如何+1————

        for(String a: hmWord) {
            if (!hm.containsKey(a))
            {
                hm.put(a,1);
            }
            else
            {
                hm.put(a, hm.get(a) +1);
            }
        }
        return hm;
    }
}
