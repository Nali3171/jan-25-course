package com.nology;

import com.nology.zoology.animal.Animal;
import com.nology.zoology.animal.AnimalFactory;
import com.nology.zoology.animal.AnimalSorting;
import com.nology.zoology.animal.AnimalType;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.zoo.Zoo;

import java.util.Random;
import java.util.Scanner;

public class ZooPlayground {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        AnimalFactory animalFactory = new AnimalFactory();

        for (int i = 0; i < 20; i++) {
            switch (RANDOM.nextInt(4)) {
                case 0:
                    zoo.addAnimal(animalFactory.createAnimal(AnimalType.tiger));
                    break;
                case 1:
                    zoo.addAnimal(animalFactory.createAnimal(AnimalType.llama));
                    break;
                case 2:
                    zoo.addAnimal(animalFactory.createAnimal(AnimalType.crocodile));
                    break;
                case 3:
                    zoo.addAnimal(animalFactory.createAnimal(AnimalType.lion));
                    break;
            }
        }
        System.out.println("Listing Animals by Name:");
        Zoo.listAnimals(AnimalSorting.byName);

        System.out.println("by type:");
        Zoo.listAnimals(AnimalSorting.byType);

        System.out.println("popularity: ");
        Zoo.listAnimals(AnimalSorting.byPopularity);

        System.out.println( zoo.getAnimalCount() );

        UserCommandRunner userCommandRunner = new UserCommandRunner(zoo);

        userCommandRunner.runCommands();


    }

    /**
     * Read an integer using the {@link Scanner}, integer must be between the min and max given.
     * @param scanner
     * @param prompt a prompt to display before getting input
     * @param min
     * @param max
     * @return
     */
    private static int readInteger(Scanner scanner, String prompt, int min, int max) {
        int num = -1;
        while ( num < min || num > max ) {
            System.out.println(prompt);
            num = scanner.nextInt();
            if( num < min || num > max ) {
                System.out.println("Please enter in range of " + min + " and " + max);
            }

        }
        return num;
    }


}
