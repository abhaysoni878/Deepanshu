class Demo 
{
	private Demo()
	{
		System.out.println("U can not call me");
	}
	public static Demo createInstance()
	{
		System.out.println("object is to created");
		return new Demo();
	}
	public void mymethod()
	{
		System.out.println("Hello i am main method");
	}
}
class Tester1
{

		public static void main(String[] args) 
	{
			//Demo obj=new Demo();//CTE
			Demo obj1=Demo.createInstance();
		//System.out.println("Hello World!");
	}
}
