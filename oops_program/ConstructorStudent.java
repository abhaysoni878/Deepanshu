package Oops;

public class ConstructorStudent {
int age;
String name;
int id;
ConstructorStudent(int i,String n){
	id=i;
	name=n;
}
ConstructorStudent(int i,String n,int a){
	id=i;
	name=n;
	age=a;
}
void display() {
	System.out.println(id+" "+name+" "+age);
}

	public static void main(String[] args) {
		ConstructorStudent obb= new ConstructorStudent(111, "raj");
		ConstructorStudent obb1=new ConstructorStudent(123, "nikhil", 23);
		obb.display();
		obb1.display();
	}
}

