package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ArrayList_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));
    }
    static void change(String[] arr){
        arr[0] ="Harish"; // Arrays are mutable, but strings are immutable.
    }
}
