package Oops;

public class StringOverloading {

	public static void main(String[] args) {
		sample obb=new sample();
		obb.add("raj","soni");
		obb.add(20, 25);
	
}
}
class sample {
	void  add(String a, String b) {
	System.out.println(a+b);
	}
	void add(int n,int m) {
		System.out.println(n+m);
	}

	
	}
