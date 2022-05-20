import java.util.Scanner;
class  Factorial
{
	public static void main(String[] args) 
	{
		int i,n,s=1;
		System.out.print("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			s=s*i;
		}
		System.out.println("The factorial number is"+s);
	}
}
