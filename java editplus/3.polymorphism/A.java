//This Demo is for non static demo
class A 
{
	int a=40;//non static
	public static void main(String args[]) 
	{
		//System.out.println(a);//CTE
		//System.out.print(a);//CTE
		A.obj=new A();
		System.out.println(obj.a);//okk
	}
}
