import java.io.*;
class  FOSDemo
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		FileOutputStream fos=new FileOutputStream("bbc.txt");
		fos.write('a');
		fos.write('b');
		fos.write(99);
		System.out.println("DATA WRITTEN TO FILE");
	}
}
