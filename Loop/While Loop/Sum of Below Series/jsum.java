public class jsum {
    public static void main(String[] args) {
        int i=1;
        double result =0;
        while ( i<=99)
        {
            result =result +(1.0/(i*(i+1)));
            i++;
        }
        System.out.println("The result is " +result);
    }
}
