//Program to find biggest of three numbers by using else if statement
import java.util.Scanner;
class p1
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       System.out.println("Enter First Number");
       int a=sc.nextInt();
       System.out.println("Enter Second Number");
       int b =sc.nextInt();
       System.out.println("Enter third Number");
       int c =sc.nextInt();

       if(a>b&& a>c)
       {
        System.out.println("The biggest number is" + a);
       }
       else if(b>c)
       {
            System.out.println(" The biggest Number is "+ b);
       }
       else
       {
        System.out.println("The biggest Number is" + c);
       }
       sc.close();
    }
}