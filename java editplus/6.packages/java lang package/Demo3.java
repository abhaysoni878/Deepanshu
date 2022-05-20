//This demo is for constructor
class Demo3
{
	public static void main(String ar[])
	{
		char ch[]={'D','D','S','I','N','G','H'};
		String s=new String(ch,2,3);
		System.out.println(s);  //SIN

		byte b[]={68,68,82,77,79,68};
		String s1=new String(b,0,2);   //DD
        System.out.println(s1);//print the  value of the above Ascii code
	}
} 

