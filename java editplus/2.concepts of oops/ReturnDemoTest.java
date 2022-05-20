//this Demo is for return keyword
class ReturnDemo 
{
	int getSum(int num1,int num2)
	{
		int result;
		result=num1+num2;
		return result;
	}
}
class ReturnDemoTest
{

	public static void main(String[] args) 
	{
		ReturnDemo rt=new ReturnDemo();
		int rec=rt.getSum(10,20);
		System.out.println("the Received value is "    +rec);
	}
}
