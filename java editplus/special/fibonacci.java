import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		int i,j,n,t1=0,t2=1,temp=0;
		System.out.print("Howmany are you want make fibonacci Series");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=3;i<=n;i++)
		{
			System.out.print(+t1+","+t2);
			t1=t2;
			t2=temp;
			temp=t1+t2;
			
			//System.out.print(temp+" ");
		}
	}
}
