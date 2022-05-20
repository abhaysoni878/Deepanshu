import java.io.*;
class Display1
{
	public static void main(String [] args)
	{
		try
		{
			//By using command line
			//FileInputStream In = new FileInputStream (args[0]);
			//in Same Folder
			FileInputStream In = new FileInputStream ("Raj.txt");
			//in a different directory/drive
			//FileInputStream In = new FileInputStream ("d:\\Raj.txt");
            //FileInputStream In = new FileInputStream ("d:/Raj.txt");
			int ch;
			while(true)
			{
				ch=  In.read();
				if(ch==-1)
				break;
				System.out.print((char)ch);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
