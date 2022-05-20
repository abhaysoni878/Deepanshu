//this demo is for labeled continue statement
class ContinueDemo2
{
	public static void main(String...args) 
	{
		outer:
			for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.println("Hello");
				continue outer;//this is labled continue.
			}
		}
		System.out.println("Good-Bye");
	}
}
