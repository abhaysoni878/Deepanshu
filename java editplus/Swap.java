import java.util.*;'
class  Swap
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		b=b+a;
		a=b-a;
		b=b-a;

		System.out.print("The swap of value is a",+a);
		System.out.println("The swap of value is b",+b);
	}
}
