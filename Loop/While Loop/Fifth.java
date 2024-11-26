//Print and count all the number upto 1000 which are divisible by 7 and also ends by 7
public class Fifth {
    public static void main(String[] args) {
        int number =7;
        int count =0;
        while(number <=1000){
            if(number%7==0 && number %10==7)
            System.out.println(number);
            count++;
            number++;
            
        }
        System.out.println("the count is = "+count);
    }
    
}
