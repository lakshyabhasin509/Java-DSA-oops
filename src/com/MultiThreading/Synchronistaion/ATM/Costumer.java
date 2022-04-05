package com.MultiThreading.Synchronistaion.ATM;

public class Costumer extends Thread {

    ATM atm;
    String name;
    int value;
    Costumer(ATM a,String n,int with){

    atm=a;
    name=n;
    value=with;

    }
    void useAtm(){
        atm.checkBalance(name);
        atm.withdraw(name,value);

    }
    public void run(){
        useAtm();
    }


}
