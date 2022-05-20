// this Demo is for Regular Inner class that is invoked outside a class .
// In this example,we are calling the msg() method of Inner class from outside the outer class i.e. Tester class.
class  Outer3
{
	private int data=30;
	class Inner
	{
		void msg()
		{
			System.out.println("data is: "+data);
		}
	}
	}
	class Tester3
	{
	public static void main(String args[]) 
	{
		Outer3 o = new Outer3();
		Outer3.Inner in= o.new Inner();
		in.msg();
	}
}
