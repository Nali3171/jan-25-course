package com.nology.zoology.command;

import com.nology.zoology.user.UserType;
import com.nology.zoology.zoo.Zoo;

public class ZooKeeperAnimalCommandRunner extends AnimalCommandRunner {

    private static final String[] KEEPER_ANIMAL_COMMANDS = {
            "List all animals",
            "Back"
    };

    public ZooKeeperAnimalCommandRunner(Zoo zoo, UserType userType) {
        super(KEEPER_ANIMAL_COMMANDS, zoo, userType);
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
        }

        return true;
    }

}
