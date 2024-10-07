public class Management {
    public static void main(String[] args) {
        Animal Animal1 = new Pig("Animal1");
        Animal Animal2 = new Duck("Animal2");
        Animal Animal3 = new Fish("Animal3");
        Animal[] animals = {Animal1, Animal2, Animal3};
        for(Animal animal : animals)
        {
            if(animal instanceof Duck) {
                System.out.println(animal.name + " swimmable and walkable");
            }
            else if(animal instanceof Swimming) {
                System.out.println(animal.name + " swimmable");
            }
            else if(animal instanceof Walking) {
                System.out.println(animal.name + " walkable");
            }
        }
    }
}
