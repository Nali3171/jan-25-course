package com.nology.zoology;

import com.nology.zoology.animal.Animal;
import com.nology.zoology.animal.AnimalUtils;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.zoo.Zoo;

import java.util.Random;
import java.util.Scanner;

public class ZooPlayground {

    public static void main(String[] args) {


//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

      //  Lion simba = new Lion(AnimalUtils.nextUniqueId(), "Simba", 2);
        //Llama kuzco = new Llama(2, "Kuzco", 5);
        //Tiger tony = new Tiger(3, "Tony", 23);
        //Crocodile krok = new Crocodile(4, "Krok", 7);

        Zoo myZoo = new Zoo();



       // for (int i = 0; i < 3; i++) {
       //     myZoo.addAnimal(tony);
       // }

       // for (int i = 0; i < 4; i++) {
       //     myZoo.addAnimal(kuzco);
        //}

       // for (int i = 0; i < 5; i++) {
        //    myZoo.addAnimal(krok);
       // }

        //RANDOM
        for(int i = 0; i < 13; i++) {
            switch (RANDOM.nextInt(4)) {case 0:
                  myZoo.addAnimal(new Lion(nextUniqueId(),
                          generateName(), generateAge()));
                    break;
                case 1:
                   myZoo.addAnimal(new Tiger(nextUniqueId(), generateName(), generateAge()));
                    break;
                case 2:
                    myZoo.addAnimal(new Llama(nextUniqueId(), generateName(), generateAge()));
                   break;
                case 3:
                    myZoo.addAnimal(new Crocodile(nextUniqueId(), generateName(),
                            generateAge()));
                   break;
            }
       // }

        Scanner keyboard = new Scanner(System.in);
        int crocodileAmount;
         int LlamaAmount;
         int tigerAmount;
         int lionAmount;
         boolean isRandom;

        private void setRandomAnimalCount(){ //METHOD
                System.out.println("How many animals would you like in the zoo?");
                int maxZooSize = keyboard.nextInt();
                keyboard.nextLine();
            }
            private void setManualAnimalCount() {

                System.out.println("How many crocodiles do you want in the Zoo?");
                crocodileAmount = keyboard.nextInt();
                System.out.println("How many Llama's do you want in the zoo?");
                LlamaAmount = keyboard.nextInt();
                System.out.println("How many tiger's do you want in the Zoo?");
                tigerAmount = keyboard.nextInt();
                System.out.println("How many Lions do you want in the Zoo?");
                lionAmount = keyboard.nextInt();
            }
        System.out.println("In the zoo there will be " + crocodileAmount + " Crocodiles, " + LlamaAmount + " Llamas, "+ tigerAmount + " tigers and " + lionAmount + " Lions.");

        for(int i=0; i< crocodileAmount; i++){

        }

        System.out.println(Zoo.getAnimalCount());

        UserCommandRunner userCommandRunner = new UserCommandRunner(Zoo);
        userCommandRunner.runCommands();

    }

}
