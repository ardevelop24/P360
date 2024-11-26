import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int x = sc.nextInt();

        if(x<0){
            System.out.println("Factorial is not defined of neg number");
        }
        else{
            long Factorial = 1;
            int i =1;
        
        while (i<=x) {
            Factorial = Factorial*i;
            i++;
            
        }
        System.out.println("The factorial of " +x + "is " + Factorial);

            

            
        }
    }
}
