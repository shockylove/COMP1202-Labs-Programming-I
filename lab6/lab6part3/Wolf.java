package lab6part3;

public class Wolf extends Carnivore {
    public Wolf(String name, int age) {
        super(name, age);
    }
    public void makeNoise(){
        super.makeNoise();
        System.out.println("howling");
    }
}
