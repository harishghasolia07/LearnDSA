package com.company;

import java.util.Scanner;

public class ArmStrong_Number_11 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean ans = isArmStrong(number);
//        System.out.println(ans);
        for (int i = 0; i < 1000000000; i++) {
            if(isArmStrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
//            System.out.println(rem);
            sum = sum+rem*rem*rem;
            num = num/10;
//            System.out.println(num);
        }
        return sum == original;
//        OR-->
//        if(sum == original){
//            return true;
//        }
//        else {
//            return false;
//        }
    }
}
