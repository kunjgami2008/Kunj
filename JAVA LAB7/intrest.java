import java.util.Scanner;
public class interest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p,r,n,t,amount,ci;

		System.out.print("please enter principale:");
		p=sc.nextDouble();

		System.out.print("please enter rate:");
		r=sc.nextDouble();

		System.out.print("please enter number of time:");
		n=sc.nextDouble();

		System.out.print("please enter  time:");
		t=sc.nextDouble();

		amount=p*Math.pow((1+(r/100)),n*t);

		System.out.println("amount = "+amount);

		ci = amount-p;

		System.out.println("Compount interest = :"+ ci);
	}
}