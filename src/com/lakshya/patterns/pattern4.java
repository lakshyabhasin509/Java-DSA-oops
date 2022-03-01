package com.lakshya.patterns;/* 12345
 * 2345
 * 345
 * 45
 * 5
 */
import java.util.Scanner;
class pattern4{
    public static void main(String ab[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            System.out.print(j);
        System.out.println();
    }

    }
}