package com.MultiThreading;

/*
//Two methods of doing multithreading
1.Thread class
2.Runnable Interface
 */

public class Main {
    public static void main(String[] args) {

        MyThread thread=new MyThread() ;


//        System.out.println(thread.getId());
//        System.out.println(thread.getPriority());
//        System.out.println(thread.getName());
        thread.start();
        thread.interrupt();
//        System.out.println(thread.getState());
//        System.out.println(thread.isAlive());
//        System.out.println(thread.isDaemon());

    }
}

