package com.DSA.recursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        RecursiveBinarySearch ob=new RecursiveBinarySearch();
        int []arr={123,1231,2432,423412,34,21,32324123,32132,3223,233223};
        System.out.println(arr[ob.Rbinary(arr,34,0,arr.length-1)]);
    }
    int Rbinary(int arr[],int key,int start,int end){
        if(start==end)
        {
            if(arr[start]==key)return start;
            else return -1;
        }
        else {
            int mid=start+(end-start)/2;
            if(key==arr[mid])return mid;
            else if(key>arr[mid])
                return Rbinary(arr,key,mid+1,end);
            else return Rbinary(arr,key,start,mid-1);
        }
    }


}
