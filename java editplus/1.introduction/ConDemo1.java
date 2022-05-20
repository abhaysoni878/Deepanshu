//this demo is for continue keyword.
class ConDemo1 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println("continue statement");
				continue;
			}
			System.out.println("value of i is:"+i);
		}
		System.out.println("out of loop");
	}
}
