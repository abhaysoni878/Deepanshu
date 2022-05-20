package Oops;

public class EmpDetails {
int id;
String name;
EmpAdd address;
public EmpDetails(int id,String name,EmpAdd address){
	this.id=id;
	this.name=name;
	this.address=address;
}
void display() {
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String[] args) {
	EmpAdd address1=new EmpAdd("mahoba","U.P","india");
	EmpAdd address2=new EmpAdd("mumbai","M.H","india");
	
	EmpDetails e=new EmpDetails(12345, "raj", address1);
	EmpDetails e1=new EmpDetails(98765, "nikhil", address2);
	e.display();
	e1.display();
}
}
