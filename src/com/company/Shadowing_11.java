package com.company;

public class Shadowing_11 {
    static int x = 10; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x; // The Lower level is over ridding the upper level.
//      System.out.println(x);-->error-->scope will begin when value is initialized.
        x = 20;
        System.out.println(x);
        num();
    }
    static void num(){
        System.out.println(x);
    }
}
