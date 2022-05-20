import java.util.Scanner;
class fib 
{
	public static void main(String[] args) 
	{
		int i,n,t1=0,t2=1,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("The fibonacci series is"+t1+","+t2);
		for(i=2;i<n;i++)
		{
			temp=t1+t2;
			System.out.print(","+temp);
			t1=t2;
			t2=temp;
		}
	}
}
