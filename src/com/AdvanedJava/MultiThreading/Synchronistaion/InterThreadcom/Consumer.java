package com.AdvanedJava.MultiThreading.Synchronistaion.InterThreadcom;

public class Consumer extends Thread{

    Mydata d;

    public Consumer(Mydata d) {
    this.d=d;
    }
    public void run(){
        while(true){

            try {
                System.out.println("get : "+d.getData()+"\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
