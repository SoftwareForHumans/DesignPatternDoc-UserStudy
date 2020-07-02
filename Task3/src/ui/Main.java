package ui;

import pattern.*;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Animal> animalsInTheZoo = new ArrayList<>();

    public static void main(String[] args) {

        try {
            AnimalFactory animalFactory = (AnimalFactory) FactoryProvider.getFactory("Animal");

            Animal pig = animalFactory.getAnimal("Pig");
            addAnimalToZoo(pig);

            Animal elephant = animalFactory.getAnimal("Elephant");
            addAnimalToZoo(elephant);

            Animal lion = animalFactory.getAnimal("Lion");
            addAnimalToZoo(lion);

        } catch (Exception e) {
            System.out.println("There is no concrete animal factory!");
        }


        for (Animal animal : animalsInTheZoo) {
            System.out.println(animal.toString() + " → is " + animal.getFeedingType() + " and eats " + animal.getNumberFeedingTimesPerDay() + " time(s) a day.");
        }

    }

    private static void addAnimalToZoo(Animal animal) {
        animalsInTheZoo.add(animal);
    }
}
