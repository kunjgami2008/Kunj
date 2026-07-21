import java.util.Scanner;

public class pattern4
{
 public static void main(String s[])
 {
  Scanner obj = new Scanner(System.in);
  int i,j,n,count=1;
  
  System.out.print("Enter N: ");
  n=obj.nextInt();

  for(i=1;i<=n;i++)
  {	
	for(j=1;j<=i;j++)
	{
		System.out.print(count+" ");
		count++;
	}
	
	System.out.println();	
  }

 }
}


