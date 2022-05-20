import java.io.*;
public class  CopyDemo
{
	public static void main(String arr[])throws IOException 
	{
		FileInputStream fi=new FileInputStream("f:/extrajava/raj.txt");
		FileOutputStream fo=new FileOutputStream("f:/extrajava/raydu.txt");
		int b;
		b=fi.read();
		while(b!=-1)
		{
			fo.write(b);
			b=fi.read();
		}
		fo.close();
		fi.close();
		//System.out.println("Hello World!");
	}
}
