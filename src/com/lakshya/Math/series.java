package com.lakshya.Math;// S=(a+1)+(a+2)+(a+3).........(a+N)  print S
import java.util.Scanner;
class series{
    public static void main(String ab[]){ 
        int i,S=0;
        Scanner sc=new Scanner(System.in);
          System.out.println("S=(a+1)+(a+2)+(a+3).........(a+N)  ");
            System.out.println("Enter the value of a :");
            int a=sc.nextInt();
        System.out.println("Enter N (length of series)");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            S=S+(a+i);
        }
        System.out.println("the Sum of the series is "+S);
   
    }
}