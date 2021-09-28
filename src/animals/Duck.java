package animals;

import foodPreferences.Herbivorous;
import movingStyle.Sky;

public class Duck extends Animal{

    public Duck(){
        setFoodPreferences(new Herbivorous());
        setMoveStyle(new Sky());
        setSpecies("Duck");
    }

}
