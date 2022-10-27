package com.DSA.MATH;

public class SQRT {
    public static void main(String[] args) {
        System.out.println(newtonSQRT(40.5));
    }
    public static double newtonSQRT(double n){

        double x=n;
        double root;

        while (true){
            root=0.5*(x+(n/x));

            if(Math.abs(root-x)< 0.1){
                break;
            }

            x=root;
        }
        return root;
    }

}
