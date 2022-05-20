import java.util.Scanner;
class  Series
{
	public static void main(String[] args) 
	{
			int i,a,j,s,n;
			boolean x;
		System.out.println("1^2/n + 3^2/n^2 + 5^2/n^2 ------n terms");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the turn the series");
		for(i=1,j=1;i<=n;i=i+1,j=j+2)
		{
			s=s(Math.pow(j,2))/(Math.pow(n,i));
			System.out.println("Sum="+s);
		}
	}
}
