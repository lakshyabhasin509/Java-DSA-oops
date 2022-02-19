/* *
   **
   ***
   ****
   *****
 */
import java.util.Scanner;
class pattern2{
    public static void main(String ab[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print("*");
        System.out.println();
    }

    }
}