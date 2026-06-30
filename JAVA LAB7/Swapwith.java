import java.util.scanner;
public class swapwith
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int temp,a,b;

		System.out.print("please enter number-1:");
		a=obj.nextInt();

		System.out.print("please enter number-2:");
		b=obj.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("swap value is :" + a +" " +b);
	}
}