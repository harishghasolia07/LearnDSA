package com.company;

public class Method_Overloading_11 {
    public static void main(String[] args) {
        num(1);
        num("Hello");
    }

// -->Method Overloading -> At the compile time decide which function will run.
// -->Method Overridding -> At the run time decide which function will run.

    static void num(int a){
        System.out.println(a);
    }
    static void num(String a){
        System.out.println(a);
    }

}
