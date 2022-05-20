class Student2 
{
	private String name;//instance variable
	private int age;

	void accept(String n,int a)//instance method/parameterized
	{
		name=n;
		age=a;
	}
	void display()//instance method/non parameterized
	{
		System.out.println("Name is "   +name);
		System.out.println("Age is "    +age);
	}
}
class Student2Test
{
	public static void main(String[] args) 
	{
		Student2 st1=new Student2();
		//st1.age=-10;   //CTE
		st1.accept("DD",32);
		st1.display();

		Student2 st2=new Student2();
		st2.accept("DEV",1);
		st2.display();
	}
}
