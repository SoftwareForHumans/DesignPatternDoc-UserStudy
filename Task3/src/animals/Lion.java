package animals;

import pattern.Animal;

public class Lion extends Animal {

    @Override
    public String getFeedingType() {
        return "Carnivorous";
    }

    @Override
    public Integer getNumberFeedingTimesPerDay() {
        return 1;
    }
}
