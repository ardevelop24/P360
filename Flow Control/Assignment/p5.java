import java.util.Scanner;
public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);

        if(ch>=65 && ch <=90){
            System.out.println("It is in Upper case");
        }
        if(ch>=97 && ch<=122)
        {
            System.out.println("It is in Lower Case");
        }

    }
}
