import java.util.Scanner;

public class Diametere
{
	public static void main(String args[])
	{
		Scanner D = new Scanner(System.in);
		Double pi = 3.14,r,area,Diametere;

		System.out.println("Enter area:");
		area = D.nextDouble();

		r =Math.sqrt( area / pi );
		
		Diametere = r*2;
		
		System.out.println("Diametere is" +Diametere);			
	

	}
}