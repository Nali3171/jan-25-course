package org.example;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> someList =
                new ArrayList<>();

        someList.add(10);
        someList.add(22);
        someList.add(55);
        someList.add(121);

        int sum = sumElements(someList); //hold the array list
        System.out.println("Sum is " + sum);


    }//end of main method

    public static int sumElements(ArrayList<Integer> list){
        int sum = 0;

        for(int i =0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;


    }//end sumElements
}
