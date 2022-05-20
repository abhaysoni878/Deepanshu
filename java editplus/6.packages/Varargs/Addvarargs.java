//This Demo is for widening beats varargs.
class  AddVarargs
{
	static void go(int x,int y)
	{
		System.out.println("int,int");
	}
	static void go(byte...x)
	{
		System.out.println("byte...");
	}
	public static void main(String[] args) 
	{
		byte b=5;
		go(b,b);//which go() will be invoked?
		//System.out.println("Hello World!");
	}
}
