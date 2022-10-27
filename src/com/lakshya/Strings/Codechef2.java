package com.lakshya.Strings;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while (n>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int temp=y;
//            if(x<y){
//                System.out.println(x);
//            }
//            else if(x==y){
//                System.out.println(x+1);
//            }
//            else {
            int count=-1;
            while(x>=0){
                if(y==0){
                    x++;
                    y=temp;
                }

                y--;
                x--;
                count++;
            }
                System.out.println(count);

//        }
            n--;
        }

    }
}

