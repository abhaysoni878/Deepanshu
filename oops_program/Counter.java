package Oops;

public class Counter {
static int count=0;
Counter(){
	count++;
System.out.println(count);
}
public static void main(String[] args) {
	Counter obb=new Counter();
	Counter obb1=new Counter();
	Counter obb2= new Counter();
}
}
