//Commonly used methods of String class 
class Demo4
{
	public static void main(String args[])
	{
		String str=new String("DD Singh");
		System.out.println(str.toUpperCase());	
		System.out.println(str.toLowerCase());
		System.out.println(str.length());  //8
		System.out.println(str.charAt(3));   //S
		System.out.println(str.indexOf('S'));               //3
		System.out.println(str.lastIndexOf('D'));      //1
		System.out.println(str.substring(3));      //Singh
		System.out.println(str.substring(3,7));
	}
} 