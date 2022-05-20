package Oops;
class testthis1 {
int rollnum;
String name;
float fee;
testthis1(int r,String n,float f){
	rollnum=r;
	name=n;
	fee=f;
}
void display() {
	System.out.println(rollnum+" "+name+" "+fee);
}
}
class Constructor{
	public static void main(String[] args) {
		testthis1 obb=new testthis1(21, "raj", 60000);
		testthis1 obb1=new testthis1(1, "abhay", 60000);
		obb.display();
		obb1.display();
	}
}