import java.util.Scanner;
class  GreatestCommonDivisor
{
	public static void main(String[] args) 
	{
		int i,j,k=1,l;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		j=sc.nextInt();
		sc.close();
		for(int p=1;p<=i && p<=j;p++)
		{
			if(i%p==0 && j%p==0)
			{
				k=p;
			}
		}
		System.out.print("The GCD of the " +i + ","+j+ "is " +k);
	}
}
