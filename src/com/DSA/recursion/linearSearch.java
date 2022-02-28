package com.DSA.recursion;



public class linearSearch {
    public static void main(String[] args) {
        int arr[]={123,23,4,32,23,213,231,89,4,32,12,2123};
        System.out.println(search(arr,89,0));
    }
    static int search(int[] arr,int key,int startindex){
        if(arr[startindex]==key)return startindex;
        if(startindex==arr.length-1)return -1;

        return search(arr,key,startindex+1);
    }



}
