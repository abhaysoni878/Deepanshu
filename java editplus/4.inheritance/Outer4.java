// This Demo is for using non-final local variable in local Inner class
class  Outer4
{
	private int data=30;//instance variable
	void display()
	{
		int value=50;//local variable must be final
		class Local
		{
			void msg()
			{
				System.out.println(data);//okk
				//System.out.println(value);//CTE in jdk1.7 only not in jdk 1.8
			}
		}
		Local I=new Local();
		I.msg();
	}
	public static void main(String[] args) 
	{
		Outer4 obj=new Outer4();
		obj.display();
		//System.out.println("Hello World!");
	}
}
