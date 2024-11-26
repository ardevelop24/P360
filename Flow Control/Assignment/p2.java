//wajp to find biggest of four numbers by using else if statement

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c =sc.nextInt();
        System.out.println("Enter fourth Number");
        int d = sc.nextInt();
        if((a==b)&&(b==c)&&(c==d))
        {
            System.out.println("a ,b ,c ,d are equal");
        }

        else if(a>b && a> c&& a> d){
            System.out.println("The biggest Number is " + a);
        }
        else if(b>a && b>c && b>d){
            System.out.println("The Biggest Number is " + b);
        }
        else if(c>a && c>b && c>d){
            System.out.println("The Biggest Number is " +c);
        }
        else
        {
            System.out.println("The Biggest Number is " +d);
        }
    
}
}
