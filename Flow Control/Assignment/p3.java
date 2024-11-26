//take year from user and print whether the year is leap or not
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year");
        int year =sc.nextInt();
        if((year%4==0 &&year %100!=0 )||(year %400 ==0)){
            System.out.println("Year is Leap year");
        }
        else{
            System.out.println("Year is not leap year");
        }
    }
}
