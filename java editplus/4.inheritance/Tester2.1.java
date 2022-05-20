interface Inter
{
}
class  Tester2 implements Inter
{
	public void honk()
	{
		System.out.println("Beep-Beep");
	}
//	@override
		public String toString()
	{
		return "r u crazy";
	}
	public static void main(String[] args) 
	{
		Inter obj=new Tester2();
		System.out.println("Hello World!");
	}
}
