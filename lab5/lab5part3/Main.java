package lab5part3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //part1
        WordGroup Plato = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup Roosevelt = new WordGroup("When you play play hard when you work dont play at all");

        String[] platoArray = Plato.getWordArray();
        String[] roosevelt = Roosevelt.getWordArray();

        System.out.println("========Print Plato Quote========");
        for (String a : Plato.getWordArray()) {
            System.out.println(a);
        }

        System.out.println("========Print Roosevelt Quote========");
        for (String a : Roosevelt.getWordArray()) {
            System.out.println(a);
        }

        //part2
        HashSet<String> hs;
        hs = Plato.getWordSet(Roosevelt);
        System.out.println("========Print HashSet Combined Quote========");
        for (String a : hs) {
            System.out.println(a);
        }

        //part3
        System.out.println("========Print Plato Words and Counts========");
        HashMap<String, Integer> platoMap = Plato.getWordCounts();
        Set<String> platoKey = platoMap.keySet();
        for (String key : platoKey) {
            System.out.println(key + ": " + platoMap.get(key));
        }

        System.out.println("========Print Roosevelt Words and Counts========");
        HashMap<String, Integer> rooseveltMap = Plato.getWordCounts();
        Set<String> rooseveltKey = platoMap.keySet();
        for (String key : rooseveltKey) {
            System.out.println(key + ": " + rooseveltMap.get(key));
        }

        System.out.println("========Print Combined Words and Counts========");
        //把两个wordgroup都加到keyset，
        //还是没搞定
        for (String var : hs) {
            int wordCounting = 0;
            for (String key : platoKey) {
                if (var.equals(key)) {
                    wordCounting += platoMap.get(platoKey);
                }
            }
            for (String rKey : rooseveltKey) {
                if (var.equalsIgnoreCase(rKey)) {
                    wordCounting += rooseveltMap.get(rooseveltKey);
                }
            }
            System.out.println(var + ": " + wordCounting);
        }
    }
}
