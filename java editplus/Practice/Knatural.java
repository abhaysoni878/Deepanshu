import java.util.Scanner;
class Knatural 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the number");
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		
		for(int i=1;i<=n;i++)
		System.out.print(" " +i);

	}
}
