import java.io.*;
 class CopyDemo
{
	public static void main(String arr[]) throws IOException
	{
		FileInputStream fi=new FileInputStream("f:/Raj.txt");
		FileOutputStream fo=new FileOutputStream("f:/Sallu.txt");
		int b;
		b=fi.read(); 												
		while(b!=-1)
		{
			fo.write(b);
			b=fi.read();
		}
		fo.close();
		fi.close();
	}
}
