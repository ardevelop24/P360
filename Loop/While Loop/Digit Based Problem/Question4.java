//print the biggest digit
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int x =sc.nextInt();

        int big=0;

        while (x>0) {
            int rem = x%10;
            if(rem>big)
            {
                big=rem;
                
            }
            
            x =x/10;

            
        }
        System.out.println(big);
        sc.close();
    }
}
