//Take a Character as user input and check whether the character is an alphabet or not

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch =sc.next().charAt(0);

        if((ch >64 && ch<91 )||(ch>96 && ch<123)){
            System.out.println("It is Alphabet");
        }
        else{
            System.out.println("It is not Alphabet");
        }
    }
}
