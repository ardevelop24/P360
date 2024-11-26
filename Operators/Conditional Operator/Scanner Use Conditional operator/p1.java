import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        
        System.out.println("Enter First Number");
        int num1=sc.nextInt();

        
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();

        int largest=(num1>num2)?num1 :num2;

        System.out.println("The biggest Number is " +largest);
        sc.close();

    }
    
}
