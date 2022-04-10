package com.AdvanedJava.MultiThreading.Synchronistaion;

public class MydataSynch {


    synchronized
    public void display(String arg) {
       while(true){
           System.out.println(arg);
       }
    }
}
