//import dd.*;//1
import dd.Demo;//2
class  Tester extends Demo
{
	void honk()
	{
		System.out.println("Beep Beep");
	}
	public static void main(String[] args) 
	{
		Tester obj=new Tester();
		obj.honk();
		obj.sum(10,20);
		//System.out.println("Hello World!");
	}
}
