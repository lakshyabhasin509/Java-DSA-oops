package com.MultiThreading.Synchronistaion;

public class Thread2 extends Thread{
    MydataSynch d;
    Thread2(MydataSynch d)
    {
        this.d=d;
    }
    public void run(){
        d.display("lakshay");
    }
}
