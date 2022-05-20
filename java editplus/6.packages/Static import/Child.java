//This Demo is for protected access specifier
package other;
import Certification_Parent;
class  Child extends Parent
{
	public void testIt()
	{
		System.out.println("x is "+x);
			//no problem Child inherits x
		Parent p=new Parent();
			//can we access  x using the performance
		//System.out.println("X in parent is "+p.x);//CTE
	}
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.testIt();
		//System.out.println("Hello World!");
	}
}
