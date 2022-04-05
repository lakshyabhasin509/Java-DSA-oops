package com.MultiThreading.Synchronistaion.InterThreadcom;

public class Main {
    public static void main(String[] args) {
        Mydata d=new Mydata();

        Consumer c=new Consumer(d);
        Producer p=new Producer(d);

        c.start();
        p.start();
    }
}
