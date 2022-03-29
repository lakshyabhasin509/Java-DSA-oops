package com.DSA.recursion;

import java.util.Stack;



public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        reverse(stack);
        System.out.println(stack);
    }

    private static void reverse(Stack<Integer> stack) {
        if(stack.isEmpty())return;

        int temp=stack.pop();
        reverse(stack);
        PushatBottomOfstack.addAtBottom(stack,temp);
    }
}
