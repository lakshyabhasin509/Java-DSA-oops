package com.AdvanedJava.MultiThreading.Synchronistaion.ATM;

//import javax.sound.midi.Soundbank;
 public class ATM {

    void checkBalance (String Name)
    {
        System.out.println(Name);

    }
    void withdraw (String name,int value)
    {
        System.out.println(name + " withdrew " + value + " amount");
    }

}
