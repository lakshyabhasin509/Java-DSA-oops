/*12345
  1234
  123
  12
  1
 */
import java.util.Scanner;
class pattern1{
    public static void main(String ab[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for( i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            System.out.print(j);
        System.out.println();
    }

    }
}