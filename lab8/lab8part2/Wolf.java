package lab8part2;

public class Wolf extends Carnivore {
    public Wolf(String name, int age) {
        super(name, age);
    }

    public Wolf(){
        super();
    }
    public void makeNoise(){
        super.makeNoise();
        System.out.println("howling");
    }
}
