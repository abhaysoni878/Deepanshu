//this is non parametrized constructor
class  Student2np
{
	String name;
	int age;//instance variable
	Student2np()//non parameterized constructor
	{
		name="shweta singh";
		age=7;
	}
	void display()//instance method
	{
		System.out.println("Name is "+name);
		System.out.println("age is"+age);
	}
	public static void main(String...args) 
	{
		Student2np st=new Student2np();
		st.display();
	}
}
