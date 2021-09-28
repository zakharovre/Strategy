import animals.Animal;
import animals.Duck;
import animals.Tiger;

public class AnimalTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        System.out.println(tiger.getSpecies());
        tiger.eat();
        tiger.move();

        Animal duck = new Duck();
        System.out.println(duck.getSpecies());
        duck.eat();
        duck.move();
    }
}
