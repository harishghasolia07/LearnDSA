package com.company;

import java.util.Arrays;

public class Variable_Argument_11 {
    public static void main(String[] args) {
        num(1,2,3,4,5,6,7,8,9);
        str("abc","def","ghi");
        multiple(1,2,"abc","def");
    }
    static void num(int ...v){ // -->Declare array of type int
        System.out.println(Arrays.toString(v));
    }
    static void str(String ...e){ // -->Declare array of type String
        System.out.println(Arrays.toString(e));
    }
    static void multiple(int a, int b,String ...v){ // -->Variable length argument always at the end.
        System.out.println(a+" "+b+Arrays.toString(v));
    }

}
