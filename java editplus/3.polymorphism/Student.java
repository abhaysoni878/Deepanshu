class  Student
{
	String name;
	int age;
	static String cname="Infomatics";
	void disp()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is"+age);
		System.out.println("The center name is"+cname);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Student st1=new Student();
		st1.name="DD";
		st1.age=32;
		Student st2=new Student();
		st2.name="Dev";
		st2.age=2;
		st1.disp();
		st2.disp();
		//System.out.println("Hello World!");
	}
}
