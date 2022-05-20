package Oops;

public class StudentsExmp {
int id;
String name;
void display() {System.out.println(id+" , "+name);}
public static void main(String[] args) {
	StudentsExmp obb=new StudentsExmp();
	StudentsExmp obb1= new StudentsExmp();
	obb.display();
	obb1.display();
}
}
