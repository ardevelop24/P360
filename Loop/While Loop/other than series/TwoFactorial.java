import java.util.Scanner;
class TwoFactorial
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number to Calculate");
        int number = sc.nextInt();
        long factorial =1;
        int i =1;
        while(i <=number)
        {
            factorial = factorial*i;

            i++;
        }
        System.out.println("The Factorial is " +factorial);

    

    }
}
