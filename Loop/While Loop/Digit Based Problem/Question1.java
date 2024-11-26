//print all digit one by one
import java.util.Scanner;
class  Question1
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        while(n>0)
        {
            int rem =n%10;
            System.out.print(rem);
            n=n/10;
        }

    }
}