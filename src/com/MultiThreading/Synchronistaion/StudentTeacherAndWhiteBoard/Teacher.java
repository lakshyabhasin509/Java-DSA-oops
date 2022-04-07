package com.MultiThreading.Synchronistaion.StudentTeacherAndWhiteBoard;

public class Teacher extends Thread {
    WhiteBoard ob;
    String[] notes={"may name is lakshya bhaisn","i am leaning multitheading","java is oop language"
    ,"END"};
    Teacher(WhiteBoard ob){
        this.ob=ob;
    }
    public void run(){
        for (int i = 0; i < notes.length; i++) {
            ob.write(notes[i]);

        } 
    }
}
