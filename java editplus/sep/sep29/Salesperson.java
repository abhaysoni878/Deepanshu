class  Employee
{
	String name;
	double baseSalary;
	Employee(String name,double baseSalary)
	{
		this.name=name;
		this.baseSalary=baseSalary;
	}
}
public class Salesperson extends Employee
{
	double commission;
	public Salesperson(String name,double baseSalary,double commission)
	{
		super(name,baseSalary);
		this.commission=commission;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
