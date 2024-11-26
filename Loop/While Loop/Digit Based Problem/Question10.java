import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int x = sc.nextInt();
        int sum =0;

        
        x = Math.abs(x);
        
        while(x>0)
        {
            int rem = x%10;
            if(rem%2==0)
            {
                sum = sum+rem;
            }
            x = x/10;
        }
        System.out.println("The sum of even digit is " + sum);
        
    }
    
}
