package com.leetcode

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++){
            if(nums[i]>nums[j])
                c++;
        }
            count[i]=c;
    }return count;
        
}}