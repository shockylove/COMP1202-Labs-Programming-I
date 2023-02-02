package lab5part2;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //part1
        WordGroup Plato = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup Roosevelt = new WordGroup("When you play play hard when you work dont play at all");

        String[] platoArray = Plato.getWordArray();
        String[] roosevelt = Roosevelt.getWordArray();

        System.out.println("========Print Plato Quote========");
        for(String a : Plato.getWordArray())
        {
            System.out.println(a);
        }

        System.out.println("========Print Roosevelt Quote========");
        for(String a : Roosevelt.getWordArray())
        {
            System.out.println(a);
        }

        //part2
        HashSet<String> hs;
        hs = Plato.getWordSet(Roosevelt);
        System.out.println("========Print HashSet Combined Quote========");
        for(String a : hs)
        {
            System.out.println(a);
        }

    }
}
