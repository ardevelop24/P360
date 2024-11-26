//Count the even digit
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number"); 
      int x = sc.nextInt();
      
      int count =0;
      if(x==0)
      {
        System.out.println("The count of even is 1 "+count);
        return ;
      }

      while(x!=0)
      {
         int rem = x%10;
         x=x/10;
        if(rem%2 ==0)
        {
            count++;
        }
       
      }
      System.out.println("Total even digit is " + count);
    }
}
