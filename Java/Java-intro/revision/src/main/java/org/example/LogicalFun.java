package org.example;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = false;

        boolean combined = isWarm && isRaining;
        System.out.println("is it raining and warm?: " + combined);

        combined = isRaining || isWarm;
        System.out.println("is it raining OR warm?: " + combined);

        combined = !isRaining;
        System.out.println("is it not raining outside?: " + combined);

    }//end main
}
