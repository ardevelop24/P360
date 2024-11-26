import java.util.Scanner;
class CpSp
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Cost Price");
		double cp =sc.nextDouble();
		System.out.println("Enter the Selling Price");
		double sp =sc.nextDouble();
		
		if(sp>cp){
			System.out.println("Profit percent is " +(((sp-cp)/cp)*100));
			}
		else if(cp>sp){
			System.out.println("Loss percent is "+(((cp-sp)/cp)*100));
			
	
		}
		else{
			System.out.println("no profit no loss");
			}
		}
}
