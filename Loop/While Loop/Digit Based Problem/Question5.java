import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int x =sc.nextInt();
        int big=0;
        int small =9;
        
        

        while (x >0) {
            int rem = x %10;
            if(rem>big)
            {
                big =rem;
            }
            x=x/10;

            if(rem<small){
                small=rem;
            }

            
        }
        System.out.println("The diffrence between big and small is  " +(big-small));
    
    }
}
