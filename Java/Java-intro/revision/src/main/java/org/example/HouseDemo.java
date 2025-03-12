package src.main.java.org.example;

import java.sql.SQLOutput;

public class HouseDemo {
    public static void main(String[] args) {

        House myHouse = new House();
        House yourHouse = new House();

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("blue");

        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(10);
        yourHouse.setColor("green");

        System.out.println("My house is " + myHouse.getColor() + " and has " + myHouse.getNumStories() + " stories and " + myHouse.getNumWindows() + " Windows. ");
        System.out.println();
        System.out.println("Your house is " + yourHouse.getColor() + " and has " + yourHouse.getNumStories() + " stories and " + yourHouse.getNumWindows() + " Windows. ");
    }//end main


    public static void printHouseData(House house){
        System.out.println();
    }
}
