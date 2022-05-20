import java.util.Scanner;
class  Initials
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=' ' + s;
		int pos=s.lastIndexOf(' ');
		for(int i=0;i<pos;i++)
		{
			if( s.charAt(i) == ' ')
				System.out.print(s.charAt(i+1) + ".");
		}
		System.out.print(s.substring(pos));
	}
}
