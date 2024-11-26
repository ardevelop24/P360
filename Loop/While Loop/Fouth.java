//print AND count all the number divisible by 7 or end with 7

public class Fouth {
    public static void main(String[] args) {
        int number =0;
        int count =0;
        while(number <=100){
            if(number%7==0 || number%10 ==7)
            System.out.println(number);
            count++;
            number++;
            
        }
        System.out.println("total count ="+count);
    }
    
}
