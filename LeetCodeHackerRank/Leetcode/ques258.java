import java.util.Scanner;
public class ques258 {

    public static int addDigits(int n)
    {
        while(n>9){
            int sum =0;
            while(n>0)
            {
                sum =sum+n%10;
                n=n%10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        System.out.println(ques258.addDigits(n));
    }
}
