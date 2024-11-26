import java.util.Scanner;
public class Question12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int x = sc.nextInt();
    int sum =0;
    x = Math.abs(x);

    while(x >0)
    {
        int digit= x%10;
        sum = sum+digit;
        x= x/10;

    }
    if(sum%2==0)
    {
        System.out.println("The sum of Digits is even");
    }
    else{
        System.out.println("The sum of digits is odd");
    }
    
}
}
