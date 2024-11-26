import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int original_Number=n;
        int sum =0;
        while(n>0)
        {
            int rem=n%10;
            int i=1;
            int fact =1;
            while (i<=rem) {
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==original_Number)
        System.out.println("It is a Strong Number");
        else{
            System.out.println("It is not a strong number");
        }
    }
}
