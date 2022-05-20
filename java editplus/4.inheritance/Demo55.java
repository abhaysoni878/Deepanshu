// This is the first way
/*
class  Demo55 extends Outer
{
	public static void main(String args[]) 
	{
		Inner i=new Inner();
		i.show();
	}
}*/
//Second Way

class Demo55 extends Outer.Inner
{
	public static void main(String args[])
	{
		new Demo55().show();
	

//		System.out.println("Hello World!");
	}
}
