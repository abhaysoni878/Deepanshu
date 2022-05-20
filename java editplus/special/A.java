import java.util.Scanner;
class  A
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		String name=s.next();
		System.out.println("enter the gender");
		char gender=s.next().charAt(0);
		int age=s.nextInt();
		long phoneno=s.nextLong();
		System.out.print("your name is"+name+"\n your gender is"+gender+"\n you age"+age+"\n your phone number is"+phoneno);
	}
}
