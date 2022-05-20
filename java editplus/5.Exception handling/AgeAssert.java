//This Demo is for assertion
import java.util.*;
class  AgeAssert
{
	public static void main(String[] args) 
	{
		System.out.println("please enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		//assert(age>0);//really simple
		assert(age>0):"enter positive value";//simple
		if(age>=18)
		{
			System.out.println("You 're an adult!=)");
		}
		else
		{
			System.out.println("u r not Adult");
		}
	}
}
