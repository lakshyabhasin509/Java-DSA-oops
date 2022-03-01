package com.lakshya.patterns;/*     1
      121
     12321
    1234321
   123454321
 */
import java.util.Scanner;
class pattern6{
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
            System.out.print(l);
            for(j=i;j>=1;j--)
            System.out.print(j);
        System.out.println();
    }

    }
}