// take a user input and print all the factor except the number itself.
import java.util.Scanner;
class Six
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1;
        int count =0;
        while (i<=n/2) {
            if(n%i==0){
                System.out.println(i);
                count++;
                
            }
            i++;
            
            
        }
        System.out.println("count is "+count);
        
    }
}

    

