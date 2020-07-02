package animals;

import pattern.Animal;

public class Elephant extends Animal {

    @Override
    public String getFeedingType() {
        return "Herbivorous";
    }

    @Override
    public Integer getNumberFeedingTimesPerDay() {
        return 2;
    }
}
