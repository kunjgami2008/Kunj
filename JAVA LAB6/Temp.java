import java.util.Scanner;

public class Temp
{
	public static void main(String args[])
	
	{
		Scanner obj = new Scanner(System.in);

		double  Fahrenheit,Celsius;

		System.out.println("Enter Fahrenheit");
		Fahrenheit=obj.nextDouble();
		
		Celsius=(Fahrenheit-32)*3/9;
		System.out.println("Celsius"+Celsius);
	}
}