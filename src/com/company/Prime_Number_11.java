package com.company;

import java.util.Scanner;

public class Prime_Number_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean ans = isPrime(a);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        //For numbers greater than 4->(4,5,6....)
        while (c*c <=n){ //c*c = 4
            if(n % c==0){
                return false;
            }
            c++;
        }
        //For numbers less than 4->(2,3)
        if(c*c>n){ //c*c = 4
            return true;
        }
        return false;

    }
}
