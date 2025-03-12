package com.nology.zoology.animal;

public class ZooPlayground {

    public static void main(String[] args) {
        System.out.println("Helllo");

        //Java intro to  basics (variables, types, control flow, loops, arrays)
        // Abstraction
        // Encapsulation
        // Polymorphism pt.1

        Lion simba = new Lion(1, "Simba", 2);
        System.out.println(simba.id);
        simba.makeSound();
        simba.getInformatin();

        Tiger tigger = new Tiger(2, "Tigger", 10);
        Llama cusco = new Llama(3, "cusco", 5);
        Crocodile coco = new Crocodile(4, "coco", 20);

        System.out.println(simba.getInformatin());
        System.out.println(tigger.getInformatin());
        System.out.println(cusco.getInformatin());
        System.out.println(coco.getInformatin());
    }
    Zoo myZoo;

    }
