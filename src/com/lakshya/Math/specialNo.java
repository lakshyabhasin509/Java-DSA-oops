package com.lakshya.Math;
//WAP to print if a number is special or not 
//i.e: sum of digits = product of digits
import java.util.Scanner;
class specialNo{
    public static void main(String ab[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;int d=0,product=1,sum=0;
         while(num>0){d=num%10;
             num=num/10;
             sum=sum+d;
             product=product*d;
             
         }
         if(sum==product)
         System.out.println("special number");
         else System.out.println("not a special number");
         
    }
}