package lab8part2;

public class Herbivore extends Animal {
    Exception ex = new Exception();
    public Herbivore(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(Food food) throws Exception {
        if(food instanceof Plant)
        {
            System.out.println(food + "is eaten by" + this.getName()  );
        }
        else
        {
            throw new Exception("This is not the suitable food for" + getName());
        }
    }


}
