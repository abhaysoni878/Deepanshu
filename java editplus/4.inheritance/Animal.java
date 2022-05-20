//This Demo is for abstract class and abstract method
abstract class  Animal
{
	public void disp()
	{
		System.out.println("I PROVIDE COLOR");
	}
	public abstract void foodHabbit();
}
class Tester extends Animal
{
	public void foodHabbit()//overriding
	{
		System.out.println("Animal can eat meat and plant");
	}

	public static void main(String[] args) 
	{
		//Animal obj=new Animal();//CTE
		Tester obj=new Tester();
		obj.disp();
		obj.foodHabbit();
		//System.out.println("Hello World!");
	}
}
