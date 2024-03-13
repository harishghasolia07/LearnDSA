package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Function_Method_11 {
    // Nothing Return -->
    static void Sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    // Return integer value -->
    static int Sum1(int a, int b){
        int sum = a+b;
        return sum;
//        System.out.println("xyz"); -->Nothing will be executed after a return statement
    }
    static void Name(String a, String b){
        String com = a+b;
        System.out.println(com);
    }
    static void Swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    //->In java there is no pass by reference its only pass by value.
    // (name and naam pointing to the same object)
    static String Name1(String naam){
//        System.out.println(naam);
        naam = "Harish Ghasolia"; //Here you are not changing the object.
                                 // Here you are creating a new object
        return naam;
    }

    public static void main(String[] args) {
        Sum(1,2);
        int add = Sum1(2,3);
        System.out.println(add);
        Name("Hari","sh");
        Swap(1,2);
        String name = "Ghasolia";
        Name1(name);
        System.out.println(name);

    }
}

/*
Note:-
Primitive data types - (int,short,char,byte) --> Just passing value.
Objects --> Passing value of the reference variable.Object ka reference pass hota hai.
*/