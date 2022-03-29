package com.DSA.recursion;

import java.util.Stack;

public class PushatBottomOfstack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        addAtBottom(stack,5);
        System.out.println(stack);
    }

    public static void addAtBottom(Stack<Integer> stack, int i) {
        if(stack.isEmpty())
        {
            stack.add(i);
            return;
        }
        int temp=stack.pop();
        addAtBottom(stack,i);
        stack.add(temp);
    }
}
