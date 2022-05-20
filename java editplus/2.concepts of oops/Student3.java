//this Demo is for default constructor that displays the default values
class  Student3
{
	int age;
	String name;//instance variable
	void display()
	{
		System.out.println(name+"\t"+age);
	}
	public static void main(String[] args) 
	{
		Student3 s1=new Student3();
		s1.display();
	}
}
