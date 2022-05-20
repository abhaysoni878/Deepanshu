package Abhay;

public class Diamond {

	public static void main(String[] args) {
		int i,j,k,count,n=5;
		count=n-1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=count;j++)
			{
				System.out.print("");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			count--;
		}
		count=0;
		for(i=n;i>0;i--)
		{
			for(j=1;j<=count;j++)
			{
				System.out.print("");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			count++;
		}

	}
}
