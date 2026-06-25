import java.util.Scanner;

public class Addition
{
	public static void main(String args[])
	{
		Scanner add = new Scanner(System.in);
		int a,b,c,ans;

		System.out.println("Enter Value of a");
		a=add.nextInt();

		System.out.println("Enter Value of b");
		b=add.nextInt();

		System.out.println("Enter Value of c");
		c=add.nextInt();

		ans=a+b+c;

		System.out.println("Ans is "+ans);
	}
}