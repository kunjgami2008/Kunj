import java.util.Scanner;

public class BMI
{
	public static void main(String args[])
	
	{
		Scanner obj = new Scanner(System.in);
		
		double weight,height,BMI,pound,inches;

		System.out.println("Enter weight in pounds :");
		pound=obj.nextDouble();

		System.out.println("Enter height in inches  :");
		inches=obj.nextDouble();

		weight = pound*0.45359237;
		
		height = inches*0.054;
		
		BMI = weight / (height*height);
		
		System.out.println("BMI index is  :"+BMI);



	}
}