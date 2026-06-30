import java.util.scanner;

public class area
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		float ss,lenght,width,sarea,sperimeter,rarea,rperimeter;
			
		System.out.print("please enter square side:");
		ss=sc.nextFloat();


		sarea=ss*ss;

		System.out.println("Square area is :"+sarea);

		sperimeter=4*ss;

		System.out.println("Square area is :"+sperimeter);
		
		System.out.print("please enter ractangle lenght:");
		lenght=sc.nextFloat();

		System.out.print("please enter square width:");
		width=sc.nextFloat();

		rarea=lenght*width;

		System.out.println("Square area is :"+rarea);

		rperimeter=2*(lenght+width);

		System.out.println("Square area is :"+rperimeter);

		
	}
}