package foodPreferences;

public class Carnivorous implements FoodPreferences{
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}
