package Oops;
interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class b implements A {
	public void c() {
		System.out.println("you are c");
	}}
	class k extends b{
		public void a() {
			System.out.println("i am a");
		}
			public void b() {
				System.out.println("i am b");
			}
	public void d() {
		System.out.println("i am d");
	}
	}
class AbstractKey {
public static void main(String[] args) {
	A a=new k();
	a.a();
	a.b();
	a.c();
	a.d();
}
}
