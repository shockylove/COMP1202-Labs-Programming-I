package lab8part2;


public abstract class Animal implements Comparable<Animal>{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
        name = "newborn";
        age = 0;
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

    public void eat(Food food, Integer times) throws Exception {
        for(int i=0 ; i<times ; i++){
            eat(food);
            System.out.println("eat" + food.getName() + i + "times");
        }
    }

    @Override
    public int compareTo(Animal o) {
        if(this.getAge() == o.getAge()){
            return 0;
        }else if(this.getAge() > o.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
