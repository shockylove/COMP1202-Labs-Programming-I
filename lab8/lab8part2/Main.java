package lab8part2;


import lab8part1.Animal;

import java.util.Collections;

public class Main {
    static Wolf wolf = new Wolf("Skip", 8);
    static Parrot parrot = new Parrot("Benji", 5);
    static Chicken Chicken = new Chicken("Gavin", 65000001);
    static Meat serloinSteak = new Meat("Serloin Steak");
    static Plant lettuce = new Plant("Lettuce");

    public static void main(String[] args){
        lab8part1();
    }

    public static void lab6() {
            //Introduces animals with their respective getters.
            System.out.println("The wolf is called " + wolf.getName() + ", they are " + wolf.getAge() + " years old.");
            System.out.println("The parrot is called " + parrot.getName() + ", they are " + parrot.getAge() + " years old.");
            System.out.println("The Chicken is called" + Chicken.getName() + ", they are " + Chicken.getAge() + " years old.");

            System.out.print(wolf.getName() + " says: ");
            wolf.makeNoise();
            System.out.print(parrot.getName() + " says: ");
            parrot.makeNoise();


            //Feeds the animals the incorrect food types, and catches the exceptions passed down as a result
            try {
                Chicken.eat(serloinSteak);
                wolf.eat(lettuce);
            } catch (Exception e) {
                System.err.println(e);
            }

        Wolf babyWolf = new Wolf();
        System.out.println(babyWolf.getAge() + babyWolf.getName());
    }

    public static void lab8part1(){
        Wolf fatwolf = new Wolf("fatwolf", 10);

        try {
            fatwolf.eat(serloinSteak,10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Wolf wolfbaby = new Wolf();
        System.out.println(wolfbaby.getName() + " "+ wolfbaby.getAge());
    }


}
