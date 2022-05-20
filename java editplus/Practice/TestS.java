public class  Tests
{
	private static int k;
	static
	{
		k=10;
		System.out.println("Static Initialization Block k="+k);
		
	}
	public static void main(String[] args) 
	{
		new Tests();
	}
}
