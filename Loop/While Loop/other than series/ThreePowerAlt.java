import java.util.Scanner;
public class ThreePowerAlt {
   public static void main(String[] args) {
    Scanner sc  =new Scanner (System.in);

    System.out.println("Enter the base digit a ");
    int a =sc.nextInt();

    System.out.println("Enter the exponetial digit b ");
    int b =sc.nextInt();

    int result =1;
    int i=0;
    while(i<b){
        result =result*a;
        i++;
    }
    System.out.println("The output is " + result);
   }
}
