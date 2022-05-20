class  F
{
	static int i;
	public static void main(String[] args) 
	{
		

		System.out.println(i);
		System.out.println(F.i);
		i=10;
		System.out.println(i);
		System.out.println(F.i);
		F.i=20;
		System.out.println(i);
		System.out.println(F.i);
	}
}
