//Product of all digit other than 0
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int x = sc.nextInt();
        int prod = 1;
        x = Math.abs(x);
        while(x>0)
        {

            int digit = x %10;
            if(digit>0)
            {
                 prod = prod*digit;
            }
            x = x/10;
            
        }
        System.out.println("The product of all digit is " +prod);


        
    }
}
