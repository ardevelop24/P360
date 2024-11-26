public class hsum {
    public static void main(String[] args) {
        int i=1;
        double result =0.0;
        while (i<=100) {
            result =result +(1.0/(i*i));
            i++;
        }
        System.out.println(result);
    }
}
