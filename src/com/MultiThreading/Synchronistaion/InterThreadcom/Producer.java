package com.MultiThreading.Synchronistaion.InterThreadcom;

import java.security.spec.ECField;

public class Producer extends Thread {
    Mydata d;
    Producer(Mydata d){
        this.d=d;

    }

    public void run(){
        int i=0;
        while (true)
        {

            try {
                System.out.println("put : "+i);
                d.set(i++);

            }catch (InterruptedException e) {
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
