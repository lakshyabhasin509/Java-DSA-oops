package com.DSA.stack;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-ii/
public class NGEII {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3,2,1,3,2,3,412,3,23,32,1,3,32,212,3,3,2,34,231,4,43,23,432,3,432,24,343};
        Solution ob=new Solution();

        System.out.println(Arrays.toString(ob.nextGreaterElements(arr)));
    }
}

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length-1;i++){
            stack.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            int n=nums[i];
            if(stack.isEmpty()){
                nums[i]=-1;
            }
            else if(stack.peek()>nums[i]){
                nums[i]=stack.peek();
            }
            else{
                while (!stack.isEmpty() && stack.peek() <=nums[i]){
                    stack.pop();
                }
                if(stack.isEmpty())nums[i]=-1;
                else nums[i]=stack.peek();

            }
            stack.push(n);
        }
        return nums;
    }
}