class Student1
{
	String name;//instance variable/data member
	int age;//instance variable/data member
}
class Student1Test 
{
	public static void main(String[] args) 
	{
		//Student1 str;//declaration
		//str=new Student1();//creating an object of student1
		//or
		//str.name="hamare chacha vidhayak h";
		//str.age=18;
		Student1 str=new Student1();
		System.out.println("              "+str.name+    "\t"+str.age    );
	}
}
