//This Demo is for Method Overriding
class  Parent
{
	public void disp()
	{
		System.out.println("black and white pic");
	}
}
class Child33 extends Parent
{
	public void disp()//overriding
	{
		super.disp();
		System.out.println("Colored pic");
	}

	public static void main(String args[]) 
	{
		Parent obj=new Child33();
		obj.disp();
		//System.out.println("Hello World!");
	}
}
