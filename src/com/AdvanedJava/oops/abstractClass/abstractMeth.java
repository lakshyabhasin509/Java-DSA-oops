package com.AdvanedJava.oops.abstractClass;

public abstract class abstractMeth {
    abstractMeth() {
        System.out.println("abstractMeth()");
    }
    void meth1() {
        System.out.println("meth1()");
    }
abstract void meth2();
}
/**
 * InnerabstractMeth extends abstractMeth abstractMeth
 */
abstract class InnerabstractMeth extends abstractMeth {

    
}
