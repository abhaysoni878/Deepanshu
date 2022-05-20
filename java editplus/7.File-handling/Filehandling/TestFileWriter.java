import java.io.*;
public class TestFileWriter
{

public static void main (String args[])throws IOException
{

	String str="India has improved its rank in football";
    FileWriter fout  = new FileWriter("Morning.txt" );
    fout.write(str, 0, str.length() );
     	fout.close();
}
}
