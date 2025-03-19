package org.example;

import java.util.Random;

public class FunWith2DArrays {

    public static void main(String[] args) {

int[][] my2DArray = new int[2][3];

fill2DArray(my2DArray);

print2DArray(my2DArray);

twice2DArray(my2DArray);
print2DArray(my2DArray);



    }

    public static void fill2DArray(int[][] twoDArr){
        Random rand = new Random();

        for(int i =0; i<twoDArr[i].length; i++){
            for(int j =0; j< twoDArr[i].length; j++){
                twoDArr[i][j]= rand.nextInt(100);
            }
        }

    }//end of fill2darray

    public static void print2DArray(int[][] twoDArray){
        for(int[] arr: twoDArray){
            for (int num : arr){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }//end of print2darray

    public static void twice2DArray(int[][] twoDArray){
        for(int i=0; i < twoDArray.length; i++){
            for(int j =0; j< twoDArray[i].length; j++){
                twoDArray[i][j] *= 2;

            }
        }
    }
}
