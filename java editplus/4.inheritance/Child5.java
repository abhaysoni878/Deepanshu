//This Demo is for method hiding and method overriding
class  Parent
{
public static void classMethod()
	{
	System.out.println("In Parent");
	}
	public void instanceMethod()
	{
		System.out.println("In Parent");
	}
}
class Child5 extends Parent
{
	public static void classMethod()//Method hiding
	{
		System.out.println("In Child");
	}
	public void instanceMethod()//Method overriding
	{
		System.out.println("In child");
	}

	public static void main(String[] args) 
	{
		P=new Child5();
		P.instanceMethod();//call with object
		P.classMethod();//call with referene
		//System.out.println(obj.var);//10
	}
}
