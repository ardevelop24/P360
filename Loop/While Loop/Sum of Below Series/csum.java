public class csum {
    public static void main(String[] args) {
        int result =0;
        int i =1;
        while(i<=100)
        {
            result =result +(i*i*i);
            i++;
        }
        System.out.println("Cubes of 100 Natural Number is" +result);
    }
}
