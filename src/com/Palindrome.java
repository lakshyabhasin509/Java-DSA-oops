package com;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome ob=new Palindrome();
        ob.backspaceCompare("ab#j","ad#j");
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack2=new Stack<>();

        for(int i=0;i<s.length();i++) {
           if(s.charAt(i)!='#')stack.add(s.charAt(i));

           else if(!stack.isEmpty()){
               stack.pop();
           }
        }
        for(int i=0;i<t.length();i++) {
            if ( t.charAt(i) != '#') {
                stack2.add(s.charAt(i));
            } else if(!stack2.isEmpty()){
                stack.pop();
            }
        }

        return stack.equals(stack2);


    }
}


