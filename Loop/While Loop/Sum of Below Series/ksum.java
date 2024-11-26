public class ksum {
    public static void main(String[] args) {

        int i =1;
        double result =0;
        while (i<=99) {
            result =result +(1.0/(i*Math.pow(i +1 ,2)));
            i++;
        }
        System.out.println("The result is " + result);
    
}
}
