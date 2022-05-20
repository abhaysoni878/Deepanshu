public class  FileCopy
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("abc.txt");
		FileOutputStream fos=new FileOutputStream("cbc.txt");//overrides
		//FileOutputStream fos=new FileOutputStream("cbc.txt",true);//appends
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("DATA HAS WRITTEN");
	}
}
