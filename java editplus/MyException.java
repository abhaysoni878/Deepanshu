class MyException extends Exception 
{
	String msg;
	public MyException()
	{
		msg="It is a custom Exception";
	}
	public MyException(String m)
	{
		msg=m;
	}
	public String toString()
	{
		return msg;
	}
}
/*	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}*/
