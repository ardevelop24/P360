import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int sum =0;

        //Handle Negative numbers
        x = Math.abs(x);
    

        while (x >0) {
            int rem = x%10;
            sum = sum +rem;
            x = x/10;

        }
        System.out.println("Total Sum is " + sum);
        
    }
}
