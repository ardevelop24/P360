
public class dsum {
    public static void main(String[] args) {
        int i=1;
        int result =0;
        while(i<=99)
        {
            result=(result +(i*(i+1)));
            i++;
        }
        System.out.println(result);
    }
}
