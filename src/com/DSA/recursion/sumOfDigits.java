package com.DSA.recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumofDigits(1234));
    }
    static int sumofDigits(int n){
        if(n==0)return 0;
        int d=n%10;
        return d+sumofDigits(n/10);


    }
}
