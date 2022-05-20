import java.util.Scanner;
class Student44
{
       String name;
       int age;                

       Student44(String name,int age)
       {
             name=n;
             age=a;
       }
       void display()
       {
           System.out.println("Name is "+name);
           System.out.println("Age is "+age);
	   }
}
class Student44Test
{
  public static void main(String... args)
  {
	  Scanner obj=new Scanner(System.in);

	  System.out.println("Enter Your Name");
	  String var1=obj.nextLine();
	  System.out.println("Enter Your Age");
	  int var2=obj.nextInt();
    Student44 st1=new Student44(var1,var2);
	 st1.display();
  }
} 