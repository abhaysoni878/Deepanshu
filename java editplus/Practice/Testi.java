public class  Testi
{
	private int x;
	{
		System.out.println("Initialization Block: x="+x);
		x=5;
	}
	public Testi()      //constructor
	{
		System.out.println("Constructor x="+x);
	}
	public static void main(String[] args) 
	{
		Testi t1=new Testi();
		Testi t2=new Testi();
	}
}
