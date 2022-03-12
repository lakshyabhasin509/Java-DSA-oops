package com.DSA.stack;

public class Main {
    public static void main(String[] args) throws Exception {
        StackLL stack=new StackLL(10);
        stack.add(10);
        stack.add(20);
        stack.add(90);
        stack.add(60);
        stack.add(22);
        stack.add(26);
        stack.add(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.get(1));
    }
}
