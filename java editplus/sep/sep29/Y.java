class  X
{
	X()
	{
		System.out.println(1);
	}
	X(int x)
	{
		this();
		System.out.println(2);
	}
}
public class Y extends X
{
	Y()
	{
		super(6);
		System.out.println(3);
	}
	Y(int x)
	{
		this();
		System.out.println(4);
	}
	public static void main(String[] args) 
	{
		new Y(5);
	}
}
