class OverDemo3 
{
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("i am the first method");
		main(10);
		OverDemo3.main(10);
		OverDemo3 obj=new OverDemo3();
		obj.main(20);
	}
}
