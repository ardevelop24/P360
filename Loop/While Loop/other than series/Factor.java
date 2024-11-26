import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();
        int count =0; 
        System.out.println("The Factor of " +n + " is" );
        int i=1;
        while(i<=n/2){
            if(n% i==0)
            {
                System.out.println(i +" ");
                count++;
                
            }
            i++;
           
        }
        System.out.println("Total Factors are :" +count);
    }
    
    
}
