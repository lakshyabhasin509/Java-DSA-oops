package com.DSA.recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(1011010101));
    }
    static int count(int n){
      return  helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        int d=n%10;
        if(d==0){
            return helper(n/10,count+1);
        }
return helper(n/10,count);
    }
}
