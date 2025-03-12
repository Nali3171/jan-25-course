package com.nology.zoology.animal;

public enum AnimalType {

    crocodile, lion, tiger, llama(true), monkey(true);
    boolean pettable = false;

    // default
    AnimalType() {
    }
    AnimalType(boolean pettable) {
        this.pettable = pettable;
    }

    public boolean isPettable() {
        return pettable;
    }
}
