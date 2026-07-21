import java.util.Scanner;

public class pattern2
{
 public static void main(String s[])
 {
  Scanner obj = new Scanner(System.in);
  int i,j,k,n;
	
  System.out.print("Enter N: ");
  n=obj.nextInt();

  for(i=1;i<=n;i++)
  {
	for(k=n;k>i;k--)
	{
		System.out.print(" ");
	}
	
	for(j=1;j<=i;j++)
	{
		System.out.print("* ");
	}

	System.out.println();	
  }
 }
}

