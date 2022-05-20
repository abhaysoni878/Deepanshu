package Oops;
 class test {
static int cube(int x) {
	return x*x*x;
}	
}
class StaticCube{
	public static void main(String[] args) {
    int result=test.cube(5);
    System.out.println(result);
	}
}
