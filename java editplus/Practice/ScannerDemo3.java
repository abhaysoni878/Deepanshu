import java.util.Scanner;
public class  ScannerDemo3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character");
		//char c=sc.next char();
		char c=sc.next().charAt(0);
		System.out.println("c="+c);
	}
}
