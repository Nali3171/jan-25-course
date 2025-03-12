package org.example;

import java.util.ArrayList;
import java.util.List;

public class Farm {

        private List<Animal> animals = new ArrayList<>();
        public Farm(){

            animals.add(new Duck());
            animals.add(new Dog());
            animals.add(new Cow());

        }
        public List<Animal> getAnimals(){
            return animals;
        } }






