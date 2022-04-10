package com.AdvanedJava.MultiThreading.Synchronistaion;

public class Thread1 extends Thread {
    MydataSynch d;
    Thread1(MydataSynch d)
    {
        this.d=d;
    }
    public void run(){
        d.display("bhasin");
    }


}
