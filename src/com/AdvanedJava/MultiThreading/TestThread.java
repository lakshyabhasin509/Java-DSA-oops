package com.AdvanedJava.MultiThreading;
//Implementing Runnable Interface

public class TestThread implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"I am back");
            i++;
    }
}}

