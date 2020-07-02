package pattern;

import animals.Elephant;
import animals.Lion;
import animals.Pig;

public class AnimalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if("Elephant".equalsIgnoreCase(type)){
            return new Elephant();
        }
        else if("Lion".equalsIgnoreCase(type)) {
            return new Lion();
        }
        else {
            return new Pig();
        }
    }
}
