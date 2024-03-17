package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension_Array_12 {
    public static void main(String[] args) {
//        int arr [][] = new int[3][]; //Initialize the no of column is not necessary
        Scanner sc = new Scanner(System.in);
//        int [][] arr2D = {
//                {1,2,3},
//                {4,5},
//                {7,8,9,10}
//        };
        int arr2D [][] = new int[3][3];
//        System.out.println(arr.length); //no of rows

        for (int row = 0; row < arr2D.length; row++){
            // For each column-->
            for (int column = 0; column < arr2D[row].length; column++){
                arr2D[row][column] = sc.nextInt();
            }
        }
        //Output
        for (int row = 0; row < arr2D.length; row++){
            // For each column-->
            for (int column = 0; column < arr2D[row].length; column++){
                System.out.print(arr2D[row][column]+" ");
            }
            System.out.println(" ");
        }

     }
}
