import java.io.*;
public class TestFileReader
{
	public static void main(String args[])throws IOException
	{
        FileReader f=new FileReader("Sallu.txt");

			int ch;
                                               
      			while((ch=f.read())!=-1)	//Loop till end of file.
      			{
        			System.out.print((char)ch);
      			}
	    	}
	
} 
