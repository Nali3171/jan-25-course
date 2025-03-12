package com.nology.zoology.animal;

import com.nology.zoology.ZooPlayground;

import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalUtils {

    private static int nextId = 0;

    // We want to be able to use this method without have to instantiate the
    // AnimalUtils class.
    public static int nextUniqueId() {

        return ++nextId;
    }

    private static final ArrayList<String> names = new ArrayList<>();
    public static Random rand = new Random();
    public static int age = 0;
    public static int maxAge = 15;


    static {
        names.add("Abbie");
        names.add("Kuzco");
        names.add("Tony");
        names.add("Bob");
        names.add("Bonzo");
        names.add("Butch");
        names.add("Charlotte");
        names.add("Clyde");
        names.add("Ermintrude");
        names.add("Eve");
        names.add("Florence");
        names.add("Fluffy");
        names.add("Freddie");
        names.add("Grumpy");
        names.add("Holly");
        names.add("Kate");
        names.add("Knuckles");
        names.add("Lauren");
        names.add("Leo");
        names.add("Maisie");
        names.add("Max");
        names.add("Nigel");
        names.add("Rex");
        names.add("Roger");
        names.add("Scoobie");
        names.add("Spangle");
        names.add("Star");
        names.add("Sydney");
        names.add("Tiddles");
    }

    public static String generateName() {
        return names.get((rand.nextInt(names.size())));
        //.size is the same for .length because its a array list
    }

    public static int generateAge() {
        return rand.nextInt(15) + 1;
    }
}


