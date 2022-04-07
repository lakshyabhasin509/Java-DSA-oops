package com.MultiThreading.Synchronistaion.StudentTeacherAndWhiteBoard;

public class Students extends  Thread{

    WhiteBoard copy;

    String name;
    Students(WhiteBoard ob,String name){
        copy=ob;
        this.name=name;
    }

   public void run(){
        String text = null;
        copy.attendence();

        do{

            text= copy.read();
            System.out.println(name + " is Reading " + text);
            System.out.flush();
        }while (!text.equals("END"));
    }


}
