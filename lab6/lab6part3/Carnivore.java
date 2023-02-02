package lab6part3;

public class Carnivore extends Animal {

    public Carnivore(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(Food food)throws Exception {
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
