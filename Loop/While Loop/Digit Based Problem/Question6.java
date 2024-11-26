//count total number of digit
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int x =sc.nextInt();
        int count =0;
        while(x >0)
        {
            int rem =x%10;
            count++;
            x=x/10;

        }
        
        System.out.println("The count of digit is " +count);
    }
    
    
}
