package lab5part1;

public class Main {
    public static void main(String[] args) {
        WordGroup Plato = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup Roosevelt = new WordGroup("When you play play hard when you work dont play at all");

        String[] platoArray = Plato.getWordArray();
        String[] roosevelt = Roosevelt.getWordArray();

        System.out.println("========Print Roosevelt Quote========");
        for(String a : Plato.getWordArray())
        {
            System.out.println(a);
        }

        System.out.println("========Print Roosevelt Quote========");
        for(String a : Roosevelt.getWordArray())
        {
            System.out.println(a);
        }
    }
}
