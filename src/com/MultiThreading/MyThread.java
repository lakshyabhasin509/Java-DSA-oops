package com.MultiThreading;
//extending Thread class
class MyThread extends Thread{

    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
/*
Synchronisation : coordination or understanding in between two threads

 */