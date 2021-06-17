package animals;

import foodPreferences.FoodPreferences;
import movingStyle.MoveStyle;

public abstract class Animal {
    private FoodPreferences foodPreferences;
    private MoveStyle moveStyle;
    private String species;

    public void setFoodPreferences(FoodPreferences foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public void setMoveStyle(MoveStyle moveStyle) {
        this.moveStyle = moveStyle;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat(){
        foodPreferences.eat();
    }

    public void move(){
        moveStyle.move();
    }
}
