//this Demo is for constructor overloading
//import java.utill scanner;
class  Construct1
{
	String name,address;
	int age;//instance variable
	Construct1(String name,int age)
	{
		this("Agra");//current class constructor
		//Construct1("Agra");//CTE
		this.name=name;
		this.age=age;
	}
	Construct1(String address)
	{
		this.address=address;
	}
	void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Address is "+address);
	}
	public static void main(String[] args) 
	{
		Construct1 st=new Construct1("DD",32);
		st.display();
		//System.out.println("Hello World!");
	}
}
