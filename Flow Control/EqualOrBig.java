import java.util.Scanner;
class EqualOrBig
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int a=sc.nextInt();
		
		System.out.println("Enter second Number");
		int b=sc.nextInt();

		System.out.println("Enter third Number");
		int c =sc.nextInt();
		
		if(a==b && b==c)
			System.out.println("a,b,c are equal");
		else if(a>b&&a>c)
			System.out.println("a is greater");
		else if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
	}
}
			