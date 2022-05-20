abstract class  Parent
{
	Parent()
	{
	System.out.println("I am constructor of parent");
	}
}
class Child77 extends Parent
{
	Child77()
	{
		super();
		System.out.println("Child constructor");
	}
	public static void main(String[] args) 
	{
		Child77 obj=new Child77();
	}
}
