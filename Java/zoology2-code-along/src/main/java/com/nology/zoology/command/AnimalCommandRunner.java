package com.nology.zoology.command;

import com.nology.zoology.animal.AnimalSorting;
import com.nology.zoology.user.UserType;
import com.nology.zoology.zoo.Zoo;

public abstract class AnimalCommandRunner extends CommandRunner {

    protected Zoo zoo;
    protected UserType userType;

    public AnimalCommandRunner(String[] commands, Zoo zoo, UserType userType) {
        super(commands, "Animal");
        this.zoo = zoo;
        this.userType = userType;
    }

    protected void listAllAnimals() {
        printMessage("All animals in the zoo:");
        this.zoo.listAnimals(AnimalSorting.byId);
    }

    protected void listAllAnimalsByType() {
        printMessage("All animals in the zoo:");
        this.zoo.listAnimals(AnimalSorting.byType);
    }

    protected void runSingleAnimalCommands() {
        SingleAnimalCommandRunner commandRunner = null;
        switch (userType) {
            case visitor:
                commandRunner = new VisitorSingleAnimalCommandRunner(zoo, null);
                break;
            case zooKeeper:
                commandRunner = new ZooKeeperSingleAnimalCommandRunner(zoo, null);
                break;
        }
        commandRunner.runCommands();
    }

    @Override
    protected void beforeCommands() {
        // do nothing
    }

    @Override
    protected boolean handleUserSelection(int userSelection) {
        if( userSelection == this.commands.length ) {
            return false;
        }

        System.out.println("Performing user selection " + userSelection);
        switch (userSelection) {
            case 1:
                listAllAnimals();
                break;
            case 2:
                listAllAnimalsByType();
                break;
            case 3:
                runSingleAnimalCommands();
                break;
        }

        return true;
    }

}
