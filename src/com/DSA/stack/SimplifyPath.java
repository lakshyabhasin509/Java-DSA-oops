package com.DSA.stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {

        SolutionSimplyfy ob=new SolutionSimplyfy();
        System.out.println( ob.simplifyPath("/..."));

    }
}

class SolutionSimplyfy {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        int lastslash=0;
        String cur="";
        for(int i=0;i<path.length();i++){
            char ch= path.charAt(i);
            if(ch=='/'){
                if(cur.equals("..")){
                    if(!stack.isEmpty())stack.pop();
                }
                else if(cur.length()!=0 && !cur.equals(".")){
                    stack.push(cur);
                }
                cur="";
            }
            else{
                cur+=ch;
            }
        }

        if(cur.equals(".."))
            if(!stack.isEmpty())stack.pop();
            else if(cur.length()!=0 && !cur.equals("."))
                stack.push(cur);

        String ans="";
        for(int i=0;i<stack.size();i++){
            ans+="/"+stack.get(i);
        }
        if(ans.length()==0)return "/";
        return ans;
    }
}