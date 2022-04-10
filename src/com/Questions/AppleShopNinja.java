package com.Questions;



//https://www.codingninjas.com/codestudio/contests/love-babbar-contest-l/problems/14804
public class AppleShopNinja {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int[] arr;
        arr= new int[]{1, 3, 7, 5, 6};
        System.out.println(  ob.minimizeSum(arr));
    }}

class Solution {
    long minimizeSum( int []arr) {

        long sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum=sum+(arr[i]+arr[i+1]);
            arr[i+1]=arr[i]+arr[i+1];

        }
        return sum;

    }
}


