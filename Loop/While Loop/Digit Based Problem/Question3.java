//Print all digit greater and equal to 5
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int x =sc.nextInt();
        System.out.println("Digit greater than or equal to 5");

        while(x>0)
        {
            int rem = x%10;
            if(rem>=5)
            {
                System.out.println(rem);
            }
            x =x/10;
        }
    }
    
}
