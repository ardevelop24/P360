//All Number which ends with 6 under 100

public class Second { 
    public static void main(String[] args) {
        int number = 0;
        while (number <= 100) {
            if (number % 10 == 6) {
                System.out.println(number);
            }
            number+=8;
        }
    }
}

