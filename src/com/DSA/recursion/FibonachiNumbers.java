package com.DSA.recursion;
//Find nth Fibo number
public class FibonachiNumbers {
    public static void main(String[] args) {

        System.out.println(FindFibono(10));
    }
   static int FindFibono(int n){
        if(n==0 || n==1)return n;

        return FindFibono(n-1)+FindFibono(n-2);

   }
}
