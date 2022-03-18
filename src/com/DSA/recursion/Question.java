package com.DSA.recursion;

import java.util.Arrays;

/*
TODO:   17 march 2020 :  1hr -> merge sort 8-9  (DONE 12:33) ✅
                         1hr -> quick sort 9-10 (NOT DONE YET 12:33)
 (10-12)1hr-> Questions ->Bubble sort using recursion
 (NOT DONE YET 12:33)  Selection sort using recursion
 https://www.geeksforgeeks.org/sum-triangle-from-array/
   https://leetcode.com/problems/reverse-string/(DONE 12:58) ✅
   https://leetcode.com/problems/power-of-two/ (DONE 13:15) ✅
   https://leetcode.com/problems/power-of-three/(DONE 13:18) ✅
   https://leetcode.com/problems/power-of-four/(DONE 13:19) ✅
  (DONE 13:29) ✅ https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

 */
public class Question {

   public static void main(String[] args) {
      int []arr={1,2,3,4,5};
      sum_triangle_from_array(arr);
   }
//    https://www.geeksforgeeks.org/sum-triangle-from-array/
   static public void sum_triangle_from_array(int []a){
       if(a.length==0)return;

       int temp[]=new int[a.length-1];
      for (int i = 0; i < a.length-1; i++) {
         temp[i]=a[i]+a[i+1];
      }

      sum_triangle_from_array(temp);
      System.out.println(Arrays.toString(a));
   }


}
