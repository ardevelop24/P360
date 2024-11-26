public class fsum {
    public static void main(String[] args) {
        int i=1;
        int result =0;
        while (i<=99) {
            result =result +((i*i)*(i+1));
            i++;
        }
        System.out.println("The sum of the series is "+result);
    }
}
