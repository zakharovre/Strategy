package animals;

import foodPreferences.Carnivorous;
import movingStyle.Land;

public class Tiger extends Animal {
    public Tiger() {
        setFoodPreferences(new Carnivorous());
        setMoveStyle(new Land());
        setSpecies("Tiger");
    }
}
