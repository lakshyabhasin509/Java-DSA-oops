package com.AdvanedJava.MultiThreading.Synchronistaion.StudentTeacherAndWhiteBoard;

public class Main {
    public static void main(String[] args) {

        WhiteBoard wb=new WhiteBoard();
        Teacher teach=new Teacher(wb);

        Students st1 = new Students(wb,"lakshya");
        Students st2 = new Students( wb,"yuvraj");
        Students st3 = new Students(wb,"karn");
        Students st4 = new Students(wb,"komal");
        teach.start();
        st1.start();
        st2.start();
        st3.start();
        st4.start();
    }

}
