package src.files;
/**
 * factorial
 * to find the factorial of a number
 */
// import java.io.*;
import java.util.Scanner;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial of : ");
        int n=sc.nextInt();
        int fac=fact(n);
        System.out.println("The factorial of "+n+" is "+fac);
        sc.close();
    }
    static int fact(int n){
        int temp=1;
        for (int i = 2; i <=n; i++) {
            temp=temp*i;
        }
        return temp;


    }

    
}