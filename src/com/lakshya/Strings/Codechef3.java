package com.lakshya.Strings;

/* package codechef; // don't place package name! */

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef3
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while (T>0){
            int n=sc.nextInt();
            int fact=1;
            if(n==1) System.out.println(1);


            else{
                String mount="";
                for(int i=0;i<n-1;i++){
                    mount+="UD";
                }

                System.out.println(countDistinctPermutations(mount)-1);

            }
            T--;
        }

    }
    static final int MAX_CHAR = 26;


    static int factorial(int n)
    {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact = fact * i;
        return fact;
    }


    static int countDistinctPermutations(String str)
    {
        int length = str.length();

        int[] freq = new int[MAX_CHAR];

        for (int i = 0; i < length; i++)
            if (str.charAt(i) >= 'A')
                freq[str.charAt(i) - 'A']++;

        int fact = 1;
        for (int i = 0; i < MAX_CHAR; i++)
            fact = fact * factorial(freq[i]);
        return factorial(length) / fact;
    }

}

