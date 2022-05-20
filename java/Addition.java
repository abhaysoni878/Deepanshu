package abhay;
import java.util.*;
public class Addition {
	public static void main(String[] args)
	{
		int i,j,p,q,m,n,k;
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();
		m=sc.nextInt();
		n=sc.nextInt();
		if(p==m && q==n)
		{
			int arr[][]=new int[p][q];
			int brr[][]=new int[m][n];
			int crr[][]=new int[m][n];

			for(i=1;i<=p;i++)
			{
				for(j=1;j<=q;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			for(i=1;i<=m;i++)
			{
				for(j=1;j<=n;j++)
				{
					brr[i][j]=sc.nextInt();
				}
			}
			for(i=1;i<=p;i++)
			{
				for(j=1;j<=n;j++)
				{
					for(k=1;k<=q;k++)
					{
						crr[i][j]=arr[i][j]+brr[i][j];
					}
				}
			}
			System.out.println("The matrix after multiplication");
			for(i=1;i<=p;i++)
			{
				for(j=1;j<=n;j++)
				{
					System.out.print(crr[i][j]+ " ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("The matrix is not addition");
		}
	}
}
