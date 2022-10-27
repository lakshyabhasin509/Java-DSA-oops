package com.lakshya;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while (n>0) {
            int rownum = sc.nextInt();
            String ifYes = "";
            int f = 0;
            while (rownum > 0) {

                String rows = sc.next();
            boolean yes=false;
                for (int i = 0; i < rows.length() - 1; i++) {
                    char ch = rows.charAt(i);
                    char ch1 = rows.charAt(i + 1);
                    if (ch == '-' && ch1 == '-' && f == 0) {
                        f = 1;
                        if(i==rows.length()-2)yes=true;
                        ifYes += "OO";
                    } else if (ch != 'O') {
                        ifYes += ch;
                    }
                }
                if(!yes)
                    ifYes+=rows.charAt(rows.length()-1);
                ifYes+='\n';

                rownum--;
            }
            if(f==1){
                System.out.println("YES");
                System.out.println(ifYes);
            }
            else System.out.println("NO");n--;
        }


    }
}
