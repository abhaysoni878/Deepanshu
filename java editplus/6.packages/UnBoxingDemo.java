class UnBoxingDemo 
{
	public static void main(String[] args) 
	{
		Integer i=new Integer(40);
		int a1=i.intValue();//unboxing
		int a2=i;//Autoboxing
		System.out.println(a1);
		System.out.println(a2);
	}
}
