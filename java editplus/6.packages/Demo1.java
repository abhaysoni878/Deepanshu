// This Demo is for Immutability and mutability
class  Demo1
{
	static public void main(String...args) 
	{
		String x="Java";
		x.concat("Rules!");
		System.out.println("x="+x);//java
		x.toUpperCase();
		System.out.println("Now still x is ="+x);//java
		StringBuffer obj=new StringBuffer("java");//this is mutable
		obj.append("Rules!");
		System.out.println("obj ="+obj);//java Rules
	}
}
