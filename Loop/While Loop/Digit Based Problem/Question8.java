//Count all digit which is 0 or 1
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int count =0;

        if(x ==0){
            count =1;
        }
        else{
            x =Math.abs(x);
        }

        while(x>0)
        {
            int rem = x%10;
            if(rem == 0 || rem ==1)
            {
               count++; 
            }
            x = x/10;
            
        }
        System.out.println("Total number of 1 or 0 is " +count);
        sc.close();

        
        
    }
}
