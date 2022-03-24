package com.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//https://www.codingninjas.com/codestudio/contests/love-babbar-contest-l/problems/14804
public class AppleShopNinja {
    public static void main(String[] args) {
char a='9';
        System.out.println(a-'0');
    }}
    class Solution {
        public int countHillValley(int[] nums) {
            int[]right=nearestEqualRight(nums);
            int[]left=nearestEqualLeft(nums);
            int count=0;
            for(int i=0;i<nums.length;i++){
                if((right[i]>nums[i] &&left[i]>nums[i]) ||(right[i]<nums[i]&&left[i]<nums[i])){

                    count++;
                }
            }
            return count;
        }
        public int[] nearestEqualRight(int[]nums){
            int[] right=new int[nums.length];
            Stack<Integer> stack = new Stack<Integer>();
            for (int j = nums.length-1; j >=0; j--) {

                int ans;
                if (stack.isEmpty()) {
                    ans = -1;
                } else {
                    if (stack.peek() != nums[j])
                        ans = stack.peek();
                    else {
                        while (!stack.isEmpty() && stack.peek() == nums[j]) {
                            stack.pop();

                        }
                        if (stack.isEmpty()) ans = -1;
                        else ans = stack.peek();
                    }
                }
                stack.push(nums[j]);
                right[j]=ans;
            }
            return right;
        }

        public int[] nearestEqualLeft(int[]nums){
            int[] left=new int[nums.length];
            Stack<Integer> stack = new Stack<Integer>();
            for (int j = 0; j < nums.length; j++) {

                int ans;
                if (stack.isEmpty()) {
                    ans = -1;
                } else {
                    if (stack.peek() != nums[j])
                        ans = stack.peek();
                    else {
                        while (!stack.isEmpty() && stack.peek() != nums[j]) {
                            stack.pop();

                        }
                        if (stack.isEmpty()) ans = -1;
                        else ans = stack.peek();
                    }
                }
                stack.push(nums[j]);
                left[j]=ans;
            }
            return left;
        }
        double sqrt(double number)
        {
            double error = 0.00001; //define the precision of your result
            double s = number;

            while ((s - number / s) > error) //loop until precision satisfied
            {
                s = (s + number / s) / 2;
            }
            return s;
        }

    }


