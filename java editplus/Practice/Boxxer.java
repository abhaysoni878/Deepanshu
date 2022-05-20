public class  Boxxer
{
	private int l,b,h;
	public Boxxer()//This is constructor
	{
		l=50; b=12; h=9;
	}
	public Boxxer(int L,int B,int H)//This is constructor
	{
		l=L; b=B; h=H;
	}
	public static void main(String[] args) 
	{
		Boxxer b1=new Boxxer();
		Boxxer b2=new Boxxer(10,20,30);
		System.out.println("Hello World!");
	}
}
