package com.DSA.recursion;

public class reverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(12345));

    }
static int reverse(int n){
int noOfdigits=((int)Math.log10(n));
return helper(n,noOfdigits);

    }
static int helper(int n,int digits){
        if(n%10==n)return n;

        return n%10*(int)Math.pow(10,digits)+helper(n/10,digits-1);
}
}






