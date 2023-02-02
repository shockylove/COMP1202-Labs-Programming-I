package lab8part2;

public class Parrot extends Omnivore {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public Parrot(int age) {
        super("Polly",age);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Squawking");
    }
}
