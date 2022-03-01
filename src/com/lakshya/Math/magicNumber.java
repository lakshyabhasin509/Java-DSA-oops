package com.lakshya.Math;
//1- 0 1(in binary)      2-10
//magic number= 5^1(5)  5^2(25)   and so on

public class magicNumber {
    public static void main(String[] args) {

        System.out.println(magicnumber(50));



    }
    static int magicnumber(int n){
        int base=5;
        int ans=0;
        while(n>0){
            int leastSignificant=n&1;
            n=n>>1;
            ans+=leastSignificant*base;
            base=base*5;
        }
        return ans;
    }
}
