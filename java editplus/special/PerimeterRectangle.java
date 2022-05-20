import java.util.Scanner;
class  PerimeterRectangle
{
	public static void main(String[] args)
	{
		long a;
		short l,b;
		Scanner sc=new Scanner(System.in);
		l=sc.nextShort();
		b=sc.nextShort();
		a=2*(l+b);

		System.out.println("The perimeter of rectangle"+a);
	}
}
