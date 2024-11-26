//sum of 100 natural number

class asum
{
    public static void main(String[] args) {
        int sum =0;
        int i =1;
        while (i<=100) {
            sum=sum+i;
            i++;
        }
        System.out.println("sum of all Numbers:" +sum);

    }
}