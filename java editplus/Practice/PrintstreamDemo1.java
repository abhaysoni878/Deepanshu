//In this demo we are simply printing integer and string values.
import java.io.*;
class  PrintstreamDemo1
{
	public static void main(String[] args)throws Exception
	{
		FileOutputStream fout=new FileOutputStream("MYFile.txt");
		PrintStream pout=new PrintStream(fout);
		pout.println(100);
		pout.println("HEllo Java");
		pout.println("welcome to java");
		pout.close();
		fout.close();
	}
}
