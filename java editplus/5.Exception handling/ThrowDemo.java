//This Demo is for throw keyword
import java.util.*;
class  ThrowDemo
{
	static void validate(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("Not valid");
			}
			else
			{
				System.out.println("Welcome to vote");
			}
		}
		catch (ArithmeticException ae)
		{
			System.err.println("Caught:"+ae.getMessage());
		}
	}
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=obj.nextInt();
		validate(age);
	}
}