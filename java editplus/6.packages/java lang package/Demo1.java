//This demo is for Immutability and Mutability
class Demo1
{

   static public void main(String... args)
    {
	String x = "Java";
	x.concat(" Rules!");
	System.out.println("x = " + x);    //Java
    x.toUpperCase();
	System.out.println("Now still x is = " + x);   //Java
	StringBuffer obj=new StringBuffer("Java");//This is Mutable
 	obj.append("Rules!");
	System.out.println("Obj  ="+obj);    //Java Rules
   }
} 
