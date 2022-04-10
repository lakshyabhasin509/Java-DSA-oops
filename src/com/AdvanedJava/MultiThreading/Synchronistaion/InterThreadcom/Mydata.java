package com.AdvanedJava.MultiThreading.Synchronistaion.InterThreadcom;

public class Mydata {
    int val=0;
    boolean flag=true;
    synchronized void set(int value) throws InterruptedException {
       while(flag!=true)
           wait();

       flag=false;
        this.val=value;
        notify();
    }
    synchronized int getData() throws InterruptedException {
        int ret=0;
        while (flag!=false)wait();

        flag=true;
        notify();
        ret=val;
        return ret;
    }
}
