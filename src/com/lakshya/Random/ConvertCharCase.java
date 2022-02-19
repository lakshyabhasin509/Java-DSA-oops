//WAP to change the case of the character
import java.util.Scanner;
class ConvertCharCase{
    public static void main(String ab[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a character ");
         char ch=sc.next().charAt(0);
         if(ch>='A' && ch<='Z')
         System.out.println((char)(ch+32));
         else if(ch>='a' && ch<='z')
         System.out.println((char)(ch-32));
    }
}