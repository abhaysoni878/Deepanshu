//Method check with reference variable and call with object in the case of overriding.
interface Inter
{
}
class Tester2 implements Inter
{
	public void honk()//user defined method
	{
		System.out.println("Beep Beep");
	}
	public String toString()//from the object class
	{
		return "r u crazy";
	}

	public static void main(String args[]) 
	{
		Inter obj=new Tester2();//upcasting
		//obj.honk();//CTE
		String receive=obj.toString();//ok
		System.out.println(receive);
	}
}
