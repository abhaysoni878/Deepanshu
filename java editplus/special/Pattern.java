import java.util.Scanner;
class Pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
					System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
