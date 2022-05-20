//This Demo is for Has a RelationShip
class  Address
{
	String city,state,country;
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
public class Emp
{
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+"\t"+name);
		System.out.println(address.city+"\t"+address.state+"\t"+address.country);
}

	public static void main(String args[]) 
	{
		Address address1=new Address("Agra","UP","india");
		Emp e1=new Emp(100,"DD",address1);
		e1.display();
		//System.out.println("Hello World!");
	}
}
