package com.lakshya.Math;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(noOfDigits(1542562165,16));
    }
    static int noOfDigits(int n, int base){
        int count=(int)(Math.log(n)/Math.log(base))+1;
        return count;
    }
}
