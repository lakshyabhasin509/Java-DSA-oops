package com.lakshya.Math;

import java.util.Scanner;
class eternals{
    public static void main(String ab[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("1.Armstrong");
        System.out.println("2.Special");
        System.out.println("3.Disarium");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                arm(n);
                break;
                case 2:
                    special(n);
                    break;
                    case 3:
                        dis(n);
                        break;
                    
        }
    }
        

           static void arm(int n){
                int num=n,d=0,a=0,sum=0;
                while(n>0){
                    d=n%10;
                    a=(int)Math.pow(d,3);
                    sum=sum+a;
                    n=n/10;}
                    if(sum==num)
                    System.out.println("Armstrong");
                    else
                    System.out.println("Not armstrong");
                }
                static void special(int n)
                {
                    int a,num=n,d,sum=0;
                    while(n>0)
                    {
                    d=1;
                    a=n%10;
                    for(int i=1;i<=a;i++)
                    {
                        d=d*i;
                    }
                    n=n/10;
                    sum=sum+d;
                }
                if(sum==num)
                System.out.print("special");
                else
                System.out.print("not special");
            }
            static void dis(int n)
            {
                int c=0;
                int sum=0;
                int a,num1=n,num=n;
                while(n>0)
                {
                    n=n/10;
                    c++;
                
                }
                while(num1>0)
                {
                 a=num1%10;
                sum=sum+(int)Math.pow(a,c);
                num1=num1/10;
                c--;
                }
                if(sum==num)
                System.out.println("disarium");
                else
                System.out.println("not disarium");
            }
            }
                
                    
                
                
                
        
    
