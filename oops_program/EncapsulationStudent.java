package Oops;

public class EncapsulationStudent {
int id;
String name;
String add;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public static void main(String[] args) {
	EncapsulationStudent obb= new EncapsulationStudent();
	obb.setId(123);
	System.out.println(obb.getId());
	obb.setName("raj");
	System.out.println(obb.getName());
	obb.setAdd("kharela");
	System.out.println(obb.getAdd());
}
}
