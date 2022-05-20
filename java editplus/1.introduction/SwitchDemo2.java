//this demo is for string comparign(from jdk1.7)
class SwitchDemo2 
{
	public static void main(String[] args) 
	{
		String Day="tuesday";
		switch (Day)
		{
		case "monday":
		System.out.println("today is monday");
		break;
		case "tuesday":
         System.out.println("today is tuesday");
		break;
		default:
			System.out.println("your choice is decent");
		}
		System.out.println("out of switch block");
	}
}
