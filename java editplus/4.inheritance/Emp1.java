public class Emp1 
{
	int id;
	String name;
	Address address;
	public Emp1(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println("\t"+name);
		System.out.println(address.city+"\t"+address.state+"\t"+address.country);
	}
	public static void main(String[] args) 
	{
		Address address1=new Address("kharela","UP","India");
		Emp1 e1=new Emp1(100,"AS",address1);
		e1.display();
		//System.out.println("Hello World!");
	}
}
