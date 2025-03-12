package io.nology.farmyard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static FarmYard farmYard = new FarmYard();

    static List<Animal> animals = new ArrayList<>(farmYard.getAnimals());

    public static void main(String[] args) {
        //How would we print all the animals that live on the farm?
        System.out.println("Before Sorting");
        //Enhanced for loop
        // for (Type of each element in the iterable structure : Structure)
        for (Animal animal : animals ){
            System.out.println(animal);
        }

        // How would we sort the animals by name?
        animals.sort(new SortByAnimalName());
        for(Animal animal : animals){
            System.out.println("After Sorting");
            System.out.println(animal);
        }

        //Using Lambda's
        //How would we print all the animals that live on the farm?
      animals.forEach(animal -> System.out.println(animal));
        //   this is how we would use labmda to show the same thing as above
        animals.forEach(animal -> {
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
        });

        animals.sort((a, b) -> a.getAge() - b.getAge());
        System.out.println("Animals after soring by age");
        animals.forEach(System.out::println);


        Collections.sort(animals, new SortByAgeThenName());

        animals.forEach(System.out::println);


    }

}
