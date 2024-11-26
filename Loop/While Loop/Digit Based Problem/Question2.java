//print all even digits

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int x =sc.nextInt();
        System.out.println("The even digits are below");

        while (x>0) {
           int rem = x%10;
           if(rem%2 ==0)
           {
            System.out.println(rem);
            
           }
           x=x/10;

        }
    }
}
