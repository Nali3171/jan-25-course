package org.example;

public class ArithmeticFun {

    public static void main(String[] args){
        int a = 10;
        int b = 15;

        int product = a * b;
        System.out.println("product is " + product);

         product *= 2;
        System.out.println("final product is " + product);


        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        System.out.println("myBool is " + myBool);
        System.out.println("YOur bool is " + yourBool);

        boolean ageComparison = myAge > yourAge;
        System.out.println(ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println(ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println(ageComparison);

        int currentAge = 23;
        boolean isGreater21 = currentAge >= 21;

        System.out.println(isGreater21);
    }
}
