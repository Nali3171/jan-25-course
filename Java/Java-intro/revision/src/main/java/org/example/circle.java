package src.main.java.org.example;

import org.example.Main;

public class circle { //variables
    private double radius;


    public circle(){
        this(1.0);
    }//no arg constructor

    //constructor
    public circle(double radius){
        this.radius = radius;
    }//end c


    public static double getRadius() { // getter
        return radius;
    }

    public void setRadius(double radius) { //setter
        this.radius = radius;
    }

    public static double circumference(){
        return 2 * radius * Math.PI;
    }
    public static double area(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
