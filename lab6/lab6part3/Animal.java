package lab6part3;

public abstract class Animal{
    String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void makeNoise(){
        System.out.println("make a noise");
    }


    public abstract void eat(Food food) throws Exception;
}
