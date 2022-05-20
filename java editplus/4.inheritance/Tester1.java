//THis Demo is for interface implementation
interface Inter
{
	public static final int FEES=3000;
	public abstract void disp();
}

class  Tester1 implements Inter
{
	public void disp()
	{
		System.out.println("Now i have the body");
	}
	public static void main(String[] args) 
	{
		System.out.println("The fees is "+FEES);
		Tester1 obj=new Tester1();//1
		obj.disp();
		Inter obj1=new Tester1();//2 upcasting
		obj1.disp();
		/*
		Inter obj2=new Inter();//3CTE
		obj2.disp();
		*/
	}
}
