package com.company;

public class Scope_11 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        {//Block Scope -->
//          int a = 70; --> Already initialize outsize the block in the same method, hence you cannot initialize.
            a=100; //Reassign the origin ref variable to some other value.You can change the value.
            System.out.println(a);
            int c = 200;
        }
        System.out.println(a);
//      System.out.println(c); //Cannot use outside the block.
    }
}


/*
Note: - Anything that is initialized outside you can use inside but anything
        that is initialized inside block you cannot use outside.
 */
