import java.util.*;
public class swapWith
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int temp,a,b;

		System.out.print("please enter number-1:");
		a=sc.nextInt();

		System.out.print("please enter number-2:");
		b=sc.nextInt();
		
		temp = a;
		a=b;
		b=temp;

		System.out.println("swap value is :" + a +" " +b);
	}
}