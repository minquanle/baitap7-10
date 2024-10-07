public class Management {
    public static void main(String[] args) {
        Animal pig = new Pig("Pig");
        Animal duck = new Duck("Duck");
        Animal fish = new Fish("Fish");
        if(pig.move())
        {
            System.out.println("Pig can walk");
        }
        if(duck.move()) {
            System.out.println("Duck can walk and swim");
        }
        if(fish.move()) {
            System.out.println("Fish can swim");
        }
    }
}
