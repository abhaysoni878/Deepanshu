// This demo is for static nested class that have static keyword
class  Outer1
{
	static int data=30;
	static class Inner
	{
		static void msg()
		{
			System.out.println("data is "+data);
		}
	}//nested class end
	public static void main(String args[]) 
	{
		Inner.msg();//no need to create the object of static nested class 
	}
}
