//This Demo is for Widening and boxing can not be performed simultaneosly
class  WidenAndBoxing
{
	static void m(Long l)
	{
		System.out.println("Long");
	}
	public static void main(String[] args) 
	{
		int a=30;
		m(a);
		//System.out.println("Hello World!");
	}
}
