package com.lakshya.patterns;/*     *
      ***
     *****
    *******
   *********
 */
import java.util.Scanner;
class pattern5{
    public static void main(String ab[])
    {
        int i,j,k,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for( i=1;i<=n;i++)
        {
            for(k=n;k>i;k--)
            System.out.print(" ");
            for(l=1;l<i;l++)
            System.out.print("*");
            for(j=1;j<=i;j++)
            System.out.print("*");
        System.out.println();
    }

    }
}