//Need of Boxing and UnBoxing
class Demo
{
    static void myMethod(Object var)
	{
	    System.out.println(var);
	}
	public static void main(String[] args)
	{
	    myMethod(10);
		myMethod(2.4);
		myMethod(true);
	}
}