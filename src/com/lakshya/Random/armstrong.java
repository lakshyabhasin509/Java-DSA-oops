import java.util.Scanner;
class armstrong{
    public static void main(String ab[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;int d=0,sum=0;
         while(num>0){d=num%10;
             num=num/10;
             sum=sum+(d*d*d);
             
             
         }
         if(sum==n)
         System.out.println("Armstrong number");
         else System.out.println("not an Armstrong number");
         
    }
}