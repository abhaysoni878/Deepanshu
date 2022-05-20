package pack1;
import pack2.Student;
public class  Example
{
	
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setrollno(1747110001);
		s1.setname("Abhay Soni");
		System.out.println("Rollno"+s1.getrollno());
		System.out.println("name"+s1.getname());
		System.out.println("Hello World!");
	}
}
