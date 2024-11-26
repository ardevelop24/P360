import java.util.Scanner;
class PowerProgram
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the base digit");
        int a = sc.nextInt();
        System.out.println("Enter the exponent digit");
        int b = sc.nextInt();

        double result =Math.pow(a, b);
        System.out.println(a +" raised to power " + b  +" is " + result);
    }
}