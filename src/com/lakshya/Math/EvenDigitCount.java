package com.lakshya.Math;
//print number of even digits in a number

import java.util.Scanner;
class EvenDigitCount{
    public static void main(String ab[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;int d=0,sum=0;
         while(num>0){
             d=num%10;
             num=num/10;
             if(d%2==0)
             sum++;
             }
        
         System.out.println("number of even digits in the number "+ sum);
         
         
    }
}