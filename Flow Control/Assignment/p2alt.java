import java.util.Scanner;
public class p2alt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number");
        int a =sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c =sc.nextInt();
        System.out.println("Enter Fourth Number");
        int d =sc.nextInt();

        int max=a;

        if(b>max)
        {
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(d>max){
            max=d;
        }

        if(a==b && b==c && c==d){
            System.out.println("a,b,c,d are equal");
        }
        else{
            System.out.println("The biggest Number is " + max);
        }


        
    }
}
