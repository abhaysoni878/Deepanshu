//this Demo is for method overloading(Data type of the parameter)
class  OverDemo2
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(float a,float b)
	{
		System.out.println(a+b);
	}
	public static void main(String args[]) 
	{
		OverDemo2 obj=new OverDemo2();
		obj.sum(10.5f,10.6f);
		obj.sum(20,20);
	}
}
