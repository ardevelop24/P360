//Take a user input and print where it is prime or not
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int i=1;
        int count=0;

        while(i<=n/2){
            if(n%i==0){
                count++;
            }
            i++;
            
        }
        if(count==1){
            System.out.println("It is prime Number");
        }
        else{
            System.out.println("It is not prime Number");
        }
    }
    
}
