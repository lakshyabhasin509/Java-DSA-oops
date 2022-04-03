package com.Questions;

public class Bit {
    public static void main(String[] args) {
       int a= Bit.minBitFlips(3,4);
        System.out.println(a);
    }
    public static int minBitFlips(int start, int goal) {

        int ans=0;

        int count1=0;
        int And=((~start)^(~goal));

        while(And!=0){
            if((And&1)==1){
                count1++;
            }
            And=And>>1;
        }
//int factor=(int)(Math.log(Math.max(start,goal))/Math.log(2))+1;
        ans=count1;


        return ans;
    }
}
