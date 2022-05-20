class  Atom
{
	Atom()
	{
		System.out.println("atom");
	}
}
class Rock extends Atom
{
	Rock(String type)
	{
		System.out.println("granite");
	}
}
public class Mountain extends Rock
{
	Mountain()
	{
		super("local");
		new Rock("vocal");
	}
	public static void main(String[] args) 
	{
		new Mountain();
	}
}
