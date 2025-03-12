package org.example;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println(doubleThis(3));

    }

    public static void printHello(){
        System.out.println("Hello There!");
    }

    public static void printNumber(int a){
        System.out.println("The number is " + a);
    }

    public static int giveMe10(){
        return 10;
    }
    public static int addThese(int num1, int num2){
        return num1 + num2;
    }
    public static double doubleThis(double num3){
        //return Math.pow(num3);
        return num3 * num3;
    }


}
