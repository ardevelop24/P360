import java.util.Scanner;
public class Question{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();
        int big=0;
        while (n>0){
            int rem=n%10;
            if(rem>big)
            big =rem;
            n=n/10;
            
        }
        System.out.println("Biggest is" +big);
        

    }
}
