package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Switch_Nested_10 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = "Harish";
//        String b = "Harish";
//
//        System.out.println(a==b); //-->If a and b are pointing the same object, then it will true otherwise false.
//        System.out.println(a.equals(b)); //-->a and b can pointinting the different object, but with the same value then it will always true because it checks only value not reference.

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        switch (name){
            case "boy":
                System.out.println("Hello Boy");
                break;
            case "boy-1":
                System.out.println("Hello boy-1");
                break;
            case "boy-2":
                System.out.println("Hello boy-2");
                break;
            default:
                System.out.println("You are not a boy");
        }
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        switch (name){
//            case "boy" -> System.out.println("Hello Boy");
//            case "boy-1" -> System.out.println("Hello boy-1");
//            case "boy" -> System.out.println("Hello Boy");
//            case "boy-1" -> System.out.println("Hello boy-1");
//            default -> System.out.println("You are not a boy");
//        }
    }
}

