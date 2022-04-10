package com.AdvanedJava.MultiThreading.Synchronistaion.ATM;

public class main {
    public static void main(String[] args) {
        ATM ob=new ATM();
        Costumer c1=new Costumer(ob,"lakshya",1000);
        Costumer c2=new Costumer(ob,"yuvraj",10);
        c2.start();
        c1.start();

    }
}
