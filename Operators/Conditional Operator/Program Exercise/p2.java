public class p2 {
   public static void main(String[] args) {
    int a=44;
    int b=56;
    int c=53;
    // int x=a>b?a:b;
    // int big=x>c?x:c;
    int big =a>b?a:b>c?a>b?a:b:c;
    System.out.println(big);
   } 
}
