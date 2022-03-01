package com.lakshya.patterns;/* 1
 * 22
 * 333
 * 4444
 * 55555
 */
import java.util.Scanner;
class pattern3{
    public static void main(String ab[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(i);
        System.out.println();
    }

    }
}
