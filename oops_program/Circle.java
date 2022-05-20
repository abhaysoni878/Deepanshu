package Oops;

 class operation {
int square(int n) {
	return n*n;
}
}
class Circle extends operation{
	double pi=3.14;
	double area(int radius) {
		Circle op=new Circle();
		int rsquare=op.square(radius);
		return pi*rsquare;
		
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		double result=c.area(5);
		System.out.println(result);
	}
}
