// This Demo is for Flavour one An Anonymous Inner class extends class
class  Parent
{
	public void disp()
	{
		System.out.println("Hello i am base class fun");
	}
}
class Tester55
{
	Parent p=new Parent()
	{
		public void disp()//overriding
		{
			super.disp();
			System.out.println("Hello i am child function");
		}
	};


	public static void main(String[] args) 
	{
		Tester55 obj=new Tester55();
		obj.p.disp();
		//System.out.println("Hello World!");
	}
}
