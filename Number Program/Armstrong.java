import java.util.Scanner;
class Armstrong
{
    public static int count(int n)
    {
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            count++;
            n =n/10;

        }
    }

    public static int pow(int a, int b)
    {
        int pow =1;
        while(pow<b)
        {
            pow =pow*a;
            b--;
        }
    }

    






//     public static void main(String[] args) {
//         S
//     }
// }