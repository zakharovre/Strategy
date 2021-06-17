package foodPreferences;

public class Omnivorous implements FoodPreferences {
    @Override
    public void eat() {
        System.out.println("Eating anything");
    }
}
