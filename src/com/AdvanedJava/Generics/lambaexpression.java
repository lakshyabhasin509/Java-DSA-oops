package com.AdvanedJava.Generics;
@FunctionalInterface
interface Mylambda{
    public int display(String str);
}
public class lambaexpression {
    public static void main(String[] args) {
Mylambda ob=(str)->{
    System.out.println(str);
};
ob.display("less goooo \n"  +
        "why you still here brahh \n");

    }
}
