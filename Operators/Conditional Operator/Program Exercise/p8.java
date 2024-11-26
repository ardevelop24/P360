public class p8 {
    
    public static void main(String[] args) 
    {
        int a=8;
        int b=5;
        int c=12;
        String result=(a+b>c && a+c>b && b+c>a)?"Triangle is Valid":"Triangle is not Valid";
    
        System.out.println(result);
    }
    
    
}
