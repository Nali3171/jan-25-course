package com.nology.zoology.animal;

public abstract class Animal implements Comparable<Animal> {
    private int id;
    protected String name;
    protected int age;
    protected short hunger = 50;
    private static final int HUNGER_LEVEL = 40;

    // Can we have a way to know when an animal is hungry and when it should
    // be fed?

    public Animal(int id, String name, int age) {
        this.id = id;
        allocateName(name);
        checkAge(age);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        allocateName(name);
        this.name = name;
    }

    public void allocateName(String name){

        try{
            if(name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty.");
            }

        }catch(IllegalArgumentException e){
            System.err.println("System Error: " + e.getMessage());
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }
    public void checkAge(int age){
        try {
            if (age < 1 || age > 99) {
                throw new IllegalArgumentException("Age must be between 1 and 99");
            }
        }catch (IllegalArgumentException exception){
                System.err.println("System Error: " + exception.getMessage());
            }
        this.age=age;
        }

    }

    public short getHunger() {
        return hunger;
    }

    public void setHunger(short hunger) {
    limitHunger(hunger);
        this.hunger = hunger;
    }
    public void limitHunger(short hunger){
        try {
            if (hunger < 0 || hunger > 100) {
                throw new IllegalArgumentException("hunger must be between 0 and 100");
            }
        }catch (IllegalArgumentException exception){
            System.err.println("System Error: " + exception.getMessage());
        }
        this.hunger= hunger;
    }

    public boolean isHungry() {
        return this.hunger >= HUNGER_LEVEL;
    };

    public void feed() {
        hunger -= 10;
        makeSound();
    }



    public void makeSound() {
        System.out.println("They say nothing ...");
    }

    public String getInformation() {
        return "";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + String.format("[id=%s, name=%s, " +
                "age=%d]", this.id, this.name, this.age);
    }


}
