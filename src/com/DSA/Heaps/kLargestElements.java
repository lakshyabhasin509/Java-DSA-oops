package com.DSA.Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class kLargestElements {
   static ArrayList<Integer> kLargest(int []nums,int k){
        Queue<Integer> qu=new PriorityQueue<>();
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            qu.add(nums[i]);
            if(qu.size()>k){
                qu.poll();
            }
        }
        int size= qu.size();
        for(int i=0;i<size;i++){
            ans.add(qu.poll());
        }
return ans;
    }

    public static void main(String[] args) {
        int[]arr={3,2,3,1,2,4,5,5,6};
        System.out.println(kLargest(arr,5));
    }
}
