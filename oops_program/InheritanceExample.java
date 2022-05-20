package Oops;

public class InheritanceExample {
 public static void main(String[] args) {
	exmp obb=new exmp();
	System.out.println(obb.bonous);
	exmp1 obb1=new exmp1();
	System.out.println(obb1.salary);
}
}
class exmp extends InheritanceExample {
	float bonous=10000;
	}
class exmp1 extends exmp{
	float salary=40000;
	
}

	