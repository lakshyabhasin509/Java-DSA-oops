package com.DSA.recursion;

public class FactorialOfNumber {
        public static void main(String[] args) {
            System.out.println(factorial(17));
    }
    static long factorial(int n){
        if(n==1)return 1;

        return (n*factorial(n-1));
    }
}
