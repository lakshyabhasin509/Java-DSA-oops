package com.MultiThreading;

/*
//Two methods of doing multithreading
1.Thread class
2.Runnable Interface
 */

public class Main {
    public static void main(String[] args) {

        MyThread thread=new MyThread() ;
        thread.start();
        TestThread testThread=new TestThread();
        Thread thread1 =new Thread(testThread);
        thread1.start();
        int i=1;

        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}

