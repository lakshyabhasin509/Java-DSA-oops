package com.MultiThreading.Synchronistaion;

public class demo {
    public static void main(String ab[]){
        MydataSynch d=new MydataSynch();

Thread2 t2=new Thread2(d);
Thread1 t=new Thread1(d);
        t.start();
t2.start();

    }
}
