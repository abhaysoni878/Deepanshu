// This Demo is for Custom Exception
class  MyException extends Exception
{
	String msg;
	public MyException(String m)
	{
		msg=m;
	}
	public String toString()
	{
		return msg;
	}
}
	
