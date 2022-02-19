package src.files;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to check for perfect number :");
        int n=sc.nextInt();
        var sum=0;
        sc.close();
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            {
                sum=sum+i;

            }
        }
        if(sum==n)
        System.out.println("Number is perfect");
        else System.out.println("number is not perfect");
    }
    
}
