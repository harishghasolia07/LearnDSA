package com.company;

/*
Notes:-
-> Which function and variables are not depended on the object -> Static varibles and functions

 */
public class Condition_Loop_9 {
    public static void main(String[] args) {
//        System.out.println("Learning DSA...");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a);
//
//        //Type Casting
//        int num = (int) (50.50f);

/*
//      --------------Q.Greatest between 2 numbers---------------

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value :");
        int a = sc.nextInt();
        System.out.print("Enter value :");
        int b = sc.nextInt();
        System.out.print("Enter value :");
        int c = sc.nextInt();
//        int max = Integer.MIN_VALUE;

//        if(a>max){
//            max = a;
//        }
//        if(b>max){
//            max = b;
//        }
//        if(c>max) {
//            max = c;
//        }
//        System.out.println(max)

        int max = Math.max(Math.max(a,b),c);
        System.out.println(max);
*/
//      Q. Check Upper case or lower case.-----------

/*      Scanner sc = new Scanner(System.in);
        char str = sc.next().trim().charAt(0);
        System.out.println(str);
        boolean isUpperCase = Character.isUpperCase(str);
        System.out.println(isUpperCase);
        if(str>='a' && str<='z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }


        Q. ---------------------------------------
*/
//        int arr [] = {1,2,3,4,3,2,1,5,2,2,2};
//        int count = 0;
//        int num = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == num){
//                count++;
//            }
//        }
//        System.out.println(count);


//      Q.---------------------------------------
//        int number = 12145;
//        int count = 0;
//        while (number>0){
//            int rem = number%10;
//            if(rem == 1){
//                count++;
//            }
//            number = number/10;
//        }
//        System.out.println(count);

        int number = 12345;
        String str = "";
        while (number>0){
            int rem = number%10;
            str = str + rem;
            number = number/10;
        }
        System.out.println(str);
//        OR-->
//        int ans = 0;
//        while (number>0){
//            int rem = number%10;
//            number /= 10;
//
//            ans = ans*10+rem;
//        }
//        System.out.println(ans);

    }
}
