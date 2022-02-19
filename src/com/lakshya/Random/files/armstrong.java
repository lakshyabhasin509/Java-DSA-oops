package src.files;


import java.util.Scanner;


public class armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to check for armstrong ");
        int n =sc.nextInt();
        sc.close();
        int num=n;
        int d,sum=0;
        while (n>0) {
            d=n%10;
            n=n/10;
            sum=sum+(d*d*d);

        }
        if(sum==num)
        System.out.println("Entered number is armstrong number ");
        else System.out.println("Entered number is not armstrong number");

    }
    
}
