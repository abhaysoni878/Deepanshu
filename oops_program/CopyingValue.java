package Oops;

public class CopyingValue {
int id;
String name;
CopyingValue(int i,String n){
	id=i;
	name=n;
}
CopyingValue(CopyingValue c){
	id=c.id;
	name=c.name;
	
}

void display() {
	System.out.println(id+" "+name);
}
public static void main(String[] args) {
	CopyingValue obb=new CopyingValue(111,"raj");
	CopyingValue obb1=new CopyingValue(obb);
	obb.display();
	obb1.display();
}
}
