import java.util.*;
class  Triangle
{
	public static void main(String[] args) 
	{
		int i,j,space=1;
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		space=n-1;
		char c=sc.next().charAt(0);
		for (j=1;j<=n ;j++)
		{
			for (i=1;i<=space;i++ )
			{
				System.out.println(" ");

			}
			space--;
			for(i=1;i<= j*2-1;i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		space=1;
		for(j=1;j<=n-1;j++)
		{
			for(i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			space++;
			for(i=1;i<=2*(n-j)-1;i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
