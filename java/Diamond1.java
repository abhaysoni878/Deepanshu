package Abhay;

public class Diamond1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}