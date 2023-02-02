package lab6part3;


public class Main {
    public static void main(String[] args){
       Wolf wolf = new Wolf("barga",26);
       Parrot parrot = new Parrot("parrot", 2);
       Chicken chicken = new Chicken("jiji",2);
       Meat meat = new Meat("meat");
       Plant plant = new Plant("plant");

        System.out.println("wolf name:" + wolf.getName() + " Age:" + wolf.getAge());
        wolf.makeNoise();
        System.out.println("parrot name:" + parrot.getName() +" Age:" + parrot.getAge());
        parrot.makeNoise();

        try {
            parrot.eat(plant);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
