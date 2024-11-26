//sum of square of 100 natural number
public class bsum {

    public static void main(String[] args) {
        int result =0;
        int i =1;
    
        while(i<=100) {
            result = (result +(i*i));
            i++;
            
        }
        System.out.println(result);
    }
}
