package org.example;

public class Cat { // class definition
    private String name;
    int age = 1;
    String colour;
    final boolean HAS_TWO_EYES = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isHAS_TWO_EYES() {
        return HAS_TWO_EYES;
    }

    Cat(){ // object
        this.name = "John"; // this. gets rid eof having to do Cat. it refers to the class name
    }

    void meow(){
        System.out.println("Meow Meow");
    }


}
