// This Demo is for multiple inheritance
interface Printable
{
	void Print();
}
interface Showable
{
	void Print();
}
class  ABC implements Printable,Showable
{
	public void Print()
	{
		System.out.println("Hello");
	}

	public static void main(String args[]) 
	{
		ABC obj=new ABC();
		obj.Print();
		//System.out.println("Hello World!");
	}
}
