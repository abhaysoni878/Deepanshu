package Oops;

public class AdderOverloading {
	static int add(int a,int b) {
		return a+b;
	}
static double add(double a,double b) {
	return a+b;
}
	public static void main(String[] args) {
		System.out.println(AdderOverloading.add(10, 20));
		System.out.println(AdderOverloading.add(12.23, 13.17));
	}
}
