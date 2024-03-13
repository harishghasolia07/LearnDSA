package com.company;

import java.util.Arrays;

public class ChangeByReference_11 {
    public static void main(String[] args) {
        //Create an Array
        int [] arr = {1,2,3,4,5};
        System.out.println("Before Calling "+Arrays.toString(arr));
        change(arr);
        System.out.println("After calling "+Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]=0;
        System.out.println("Inside Method "+Arrays.toString(nums));
    }
}

/*
Notes:-
In call by reference, the memory address (reference) of the actual parameter is passed to the method.
This allows the method to directly modify the value of the parameter outside the method since it's accessing the same memory location.
Java does not support call by reference for primitive data types. However, when you pass objects (instances of classes) as arguments, the reference to the object is passed by value. This means that the method can modify the state of the object, but it cannot reassign the reference itself.
 */
