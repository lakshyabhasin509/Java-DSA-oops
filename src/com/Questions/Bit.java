package com.Questions;

import java.util.ArrayList;
import java.util.List;

public class Bit {
    public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();
    list.add(10);
    list.get(0);

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
