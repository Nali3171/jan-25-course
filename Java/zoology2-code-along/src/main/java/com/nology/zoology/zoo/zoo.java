package com.nology.zoology.zoo;

import com.nology.zoology.animal.*;

import java.util.*;

public class Zoo {

    private static ArrayList<Animal> animals = new ArrayList<>();

    /**
     * Fast lookup for Animal by id
     */
    private Map<Integer, Animal> idMap = new HashMap<>();

    /**
     * Fast lookup for animals by their name
     */
    private Map<String, List<Animal>> nameMap = new HashMap<>();

    public Zoo() {
        System.out.println("Zoo starting up!");
    }

    public void addAnimal(Tiger tiger) {
        this.animals.add(tiger);

        addAnimalToMaps(tiger);
    }

    public void addAnimal(Llama llama) {
        this.animals.add( llama );

        addAnimalToMaps(llama);
    }

    public void addAnimal(Crocodile crocodile) {
        this.animals.add(crocodile);

        addAnimalToMaps(crocodile);
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);

        addAnimalToMaps(animal);
    }

    public int getAnimalCount() {
        return this.animals.size();
    }

    private void addAnimalToMaps(Animal animal) {
        this.idMap.put( animal.getId(), animal);
        List<Animal> animalList = this.nameMap.getOrDefault( animal.getName().toLowerCase(), new ArrayList<>() );
        animalList.add(animal);
        this.nameMap.put( animal.getName().toLowerCase(), animalList);
    }

    public static void listAnimals(AnimalSorting animalSorting) {
        switch (animalSorting) {
            case byName:
                // replace with lambda
                animals.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
                break;
            case byType:
                //Collections.sort(animals, new SortByAnimalTypeThenName());
                animals.sort((a, b) -> a.getType().compareTo(b.getType()));
                break;
            case byPopularity:
                animals.sort((a, b) -> a.getPopularity() - b.getPopularity());
                break;
            default:
                Collections.sort(animals);
        }
        for (Animal animal : animals) {
            System.out.println(animal.getInformation());
        }
    }

    /**
     * Return a list of all animals in zoo.
     * @return
     */
    public List<Animal> getAllAnimals() {
        return this.animals;
    }

    public Animal findAnimalById(int id) {
        return this.idMap.get(id);
    }

    public List<Animal> findAnimalsByName(String name) {
        return this.nameMap.get( name.toLowerCase() );
    }

    public void shutdownZoo() {
        System.out.println("Zoo shutdown");
    }

}
