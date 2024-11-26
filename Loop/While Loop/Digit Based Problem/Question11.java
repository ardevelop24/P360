import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int x = sc.nextInt();
        int sum =0;
        x =Math.abs(x);
        while(x>0)
        {
            int digit = x%10;
            if(digit >5)
            {
                sum = sum+digit;
            }
            x = x/10;
        }
        System.out.println("The Sum of digit greater than 5 are " +sum);
        sc.close();


    }
}
