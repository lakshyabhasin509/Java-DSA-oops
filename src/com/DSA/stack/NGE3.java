package com.DSA.stack;

import java.util.Stack;

public class NGE3 {
    public static void main(String[] args) {

    }
}
class Solutionng3 {
    public int nextGreaterElement(int n) {
        StringBuffer in = new StringBuffer(Integer.toString(n));

        Stack<Integer> stack = new Stack<>();
        stack.push(in.length() - 1);
        int leftInd = -1, rightInd = -1;
        for (int i = in.length() - 2; i >= 0; i--) {
            char ch = in.charAt(i);
            int val = Integer.parseInt(String.valueOf(ch));

            int f = 0;
            while (!stack.isEmpty()) {
                if (Integer.parseInt(String.valueOf(in.charAt(stack.peek()))) > val) {
                    leftInd = i;
                    f = 1;
                    rightInd = stack.peek();
                    break;
                }

                stack.pop();
            }
            if (f == 1) break;
            stack.push(i);
        }
        if (leftInd == -1 || rightInd == -1) return -1;
        char right = in.charAt(leftInd);
        char left = in.charAt(rightInd);

        in.setCharAt(rightInd, right );
        in.setCharAt(leftInd, left);


        return Integer.parseInt(in.toString());

    }
}