//this Demo is for single level inheritance.
class  Parent
{
	void disp()
	{
		System.out.println("I Provide black and white pic");
	}
}
	class Child extends Parent
	{
		void honk()
		{
			System.out.println("Beep Beep");
		}
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.disp();
		obj.honk();
	}
}
