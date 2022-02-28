package com.DSA.recursion;

public class reverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(12345,0));

    }
static int reverse(int n,int rev){
        if(n%10==n)return n;
        return rev*10 +(reverse(n/10,n%10));
}}





