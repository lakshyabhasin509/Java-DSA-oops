package src.rev;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number you want reverse ");
        int n =sc.nextInt();
        sc.close();

        int d,rev=0;
    while (n>0) {

        d=n%10;
        n=n/10;
        rev=(rev*10)+d;


    }
    System.out.println("the reverse number is :"+rev);
} 
    
}
