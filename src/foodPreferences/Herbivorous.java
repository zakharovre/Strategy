package foodPreferences;

public class Herbivorous implements FoodPreferences{
    @Override
    public void eat() {
        System.out.println("Eating herbs");
    }
}
