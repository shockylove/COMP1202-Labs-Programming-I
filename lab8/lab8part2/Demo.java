package lab8part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
*                   Interface  &  Abstract class
*   1.initialize:   both can not
*   2.class         many interface| one superclass(hesitance)
*   3.method        both do not have body
*                   no limited | abstract method must at least one
*   4.variables     public static final must | no limited
*   5.relation      like-a | is-a
*   6.key word      implements | extends
* */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Wolf("Skip", 5));
        animals.add(new Wolf("BigDog", 11));
        animals.add(new Wolf());
        animals.add(new Parrot(8));
        animals.add(new Parrot("Sandra", 18));
        animals.add(new Parrot("sarah",9));
        animals.add(new Chicken("Carnassa", 9));
        animals.add(new Chicken("Barnabus", 100));
        animals.add(new Chicken("Dred", 105));

        System.out.println("===Before sort===");
        printLine(animals);
        Collections.sort(animals);
        System.out.println("===After sort===");
        printLine(animals);
    }

    public static void printLine(ArrayList<Animal> arrayList){
        for(Animal o : arrayList){
            System.out.println(o.getName() + " is " + o.getAge() + " years old.");
        }
    }
}
