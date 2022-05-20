import java.util.*;
class  ThrowDemo1
{
	static void validate(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("Age must be>18");
			}
			else
			{
				System.out.println("Welcome to vote");
			}
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Caught"+ae.getMessage());
		}
	}
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=obj.nextInt();
		validate(age);
	}
}
