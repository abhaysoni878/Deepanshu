package Oops;

public class StaticFunc {
int rollnum;
String name;
static int age=19;
static String collegename="ECE"; 
StaticFunc(int r,String n){
	rollnum=r;
	name=n;
}
StaticFunc(int r,String n,int a){
	rollnum=r;
	name=n;
	age=a;
}
void display() {
	System.out.println(rollnum+" "+name+" "+collegename+" "+age);
}
public static void main(String[] args) {
	StaticFunc obb=new StaticFunc(21, "raj");
	obb.display();
	StaticFunc obb1=new StaticFunc(01, "abhay", 20);
	obb1.display();
}
}

