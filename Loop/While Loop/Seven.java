     //to print and count all the factor of number
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int i =1;
       int count =0;
       while(i<=n){ 
        if(n%i==0){
        System.out.println(i);
        count++;
        }
        i++;
        
    }
    System.out.println("Total count is "+count);
      
    
    }
    
}
