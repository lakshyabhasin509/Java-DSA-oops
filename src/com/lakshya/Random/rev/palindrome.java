package src.rev;
import java.util.Scanner;
public class palindrome {public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number you want reverse ");
        int n =sc.nextInt();
        sc.close();
        int num=n;
        int d,rev=0;
    while (n>0) {

        d=n%10;
        n=n/10;
        rev=(rev*10)+d;


    }
    if(num==rev)
    System.out.println("palindrome");
    else System.out.println("not palindrome");
}
    
}
