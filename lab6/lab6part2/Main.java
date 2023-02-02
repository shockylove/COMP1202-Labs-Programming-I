package lab6part2;

public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("barga",26);
        Parrot parrot = new Parrot("parrot", 2);
        Meat meat = new Meat("meat");
        Plant plant = new Plant("plant");

        System.out.println("wolf name:" + wolf.getName() + " Age:" + wolf.getAge());
        wolf.makeNoise();
        System.out.println("parrot name:" + parrot.getName() +" Age:" + parrot.getAge());
        parrot.makeNoise();

    }

}
