package lab8part2;

public class Carnivore extends Animal {

    public Carnivore(String name, int age) {
        super(name, age);
    }

    public Carnivore() {
        super();
    }

    @Override
    public void eat(Food food) throws Exception {
        if(food instanceof Meat)
        {
            System.out.println(food + "is eaten by" + this.getName()  );
        }
        else
        {
            throw new Exception("This is not the suitable food for" + getName());
        }

    }


}
