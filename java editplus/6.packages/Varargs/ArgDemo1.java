// This Demo is for varargs
class  ArgDemo1
{
	void sum(int...num)
	{
		int total=0;
		for(int result:num)     //Ths is enhanced loop
		{
			total+=result;//total=total+result;
		}
		System.out.println("the sum of numbers is"+total);
	}
	public static void main(String[] args) 
	{
		ArgDemo1 obj=new ArgDemo1();
		obj.sum();//o arguments
		obj.sum{10,20,30,40};//more arguments
		System.out.println("Hello World!");
	}
}
