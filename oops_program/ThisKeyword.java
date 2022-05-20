package Oops;
class test2{
    int rollnum;
	String name;
	float fee;
	test2(int rollnum,String name,float fee){
		this.rollnum=rollnum;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollnum+" "+name+" "+fee);
	}
}
class ThisKeyword {
public static void main(String[] args) {
	test2 obb=new test2(111,"raj",32000);
	test2 obb1=new test2(121,"nikhil",32000);
	obb.display();
	obb1.display();
}
}
