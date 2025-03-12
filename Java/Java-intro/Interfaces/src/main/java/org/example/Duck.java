package org.example;

public class Duck extends Animal implements CanFly, CanMakeSound {
    @Override
    public AnimalType getType() {
        return AnimalType.duck;
    }
    @Override
    public void fly() {
        System.out.println("Flap flap");
    }
    @Override
    public void makeSound() {
        System.out.println("Quack quack!");
    }
}
