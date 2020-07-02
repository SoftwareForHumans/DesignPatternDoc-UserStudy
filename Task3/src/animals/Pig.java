package animals;

import pattern.Animal;

public class Pig extends Animal {

    @Override
    public String getFeedingType() {
        return "Omnivorous";
    }

    @Override
    public Integer getNumberFeedingTimesPerDay() {
        return 3;
    }
}
