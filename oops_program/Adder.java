package Oops;

public class Adder {
	static int add(int a,int b) {
		return a+b;
	}
static double add(double a,double b) {
	return a+b;
}
	public static void main(String[] args) {
		System.out.println(Adder.add(10, 11));
		System.out.println(Adder.add(23.23, 17.18));
	}
}
