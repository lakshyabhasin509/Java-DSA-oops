package com.AdvanedJava.Generics;
@FunctionalInterface
interface Mylambda{
    public int display(int a,int b);
}
public class lambaexpression {
    public static void main(String[] args) {
Mylambda ob=(a,b)->a+b;
        System.out.println(ob.display(10,20));

    }
}
