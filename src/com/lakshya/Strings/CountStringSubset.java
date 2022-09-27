package com.lakshya.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountStringSubset {
    static int countMaximumOperations(String s,String t){
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int fr=map.get(ch);
                map.put(ch,fr+1);
            }
            else map.put(ch,1);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch))return 0;

            int fr=map.get(ch);
            if(fr<min)min=fr;
        }
return min;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();

        System.out.println(countMaximumOperations(s,t));
    }
}
