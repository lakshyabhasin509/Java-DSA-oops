package com.MultiThreading.Synchronistaion.StudentTeacherAndWhiteBoard;

public class WhiteBoard {
    String Text;
    int NoOfStudents=0;
    int count=0;
public void attendence(){
    NoOfStudents++;
}
   synchronized void write(String text){

        System.out.println("Teacher is Writing "+ text);
        while(count!=0){
           try {
               wait();
           }catch (Exception e){
               e.printStackTrace();
           }
        }
    Text=text;
    count=NoOfStudents;
    notifyAll();
    }
    synchronized String read(){

        while(count==0){
            try {
                wait();
            }catch (Exception e) {
                e.printStackTrace();}
        }
        String copy=Text;
        count--;
        if(count==0)notify();
        return copy;
    }








}
