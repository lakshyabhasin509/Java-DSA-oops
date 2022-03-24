package com.DSA.recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
int res=subSeqRet("","aaabb","ab");
        System.out.println(res);
    }
//    just printing it
    public static void subSeq(String result, String s){
        if(s.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch=s.charAt(0);
        subSeq(result,s.substring(1));
        subSeq(result+ch,s.substring(1));
    }
    public static int subSeqRet(String result, String s,String pattern){

        if(s.isEmpty()){

            if(result.equals(pattern))return 1;
            else return 0;
        }
        char ch=s.charAt(0);
        int left= subSeqRet(result,s.substring(1),pattern);
        int right=subSeqRet(result+ch,s.substring(1),pattern);

    return left+right;
    }
}
