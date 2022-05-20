class  Demo
{
	private int var=10;
	private void disp()
	{
		System.out.println("Hi");
	}
}
class Tester99
{
	public static void main(String[] args) 
	{
		Demo obj=new Demo();//OKK
		System.out.println(obj.var);//CTE
		obj.disp();//CTE
	}
}
