class  ClassA
{
	public int numberOfinstances;
	protected ClassA(int numberOfinstances)
	{
		this.numberOfinstances=numberOfinstances;
	}
}
public class ExtendedA extends ClassA
{
	private ExtendedA(int numberOfinstances)
	{
		super(numberOfinstances);
	}
	public static void main(String[] args) 
	{
		ExtendedA ext=new ExtendedA(420);
		System.out.println(ext.numberOfinstances);
	}
}
