class Demo2
{
	public static final void main(String ar[])
	{
		String s=new String("hello");
		String s1=new String ("hello");
		String s2="hello";
		if(s==s1)
		{
			System.out.println("Both are Equal");
        }
        else
        {
			System.out.println("Both are not Equal");
        }
		if(s==s2)
        {
			System.out.println("Both are Equal");
        }
        else
        {
			System.out.println("Both are not Equal");
        }
		String s3=s.intern();
		if(s3==s2)
        {
			System.out.println("Both are Equal");
        }
        else
        {
			System.out.println("Both are not Equal");
        }
 	}
}
