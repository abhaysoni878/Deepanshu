package Oops;
class Animal{
	void eat() {
		System.out.println("eating.....");
	}
}
class Human extends Animal{
	void eat() {
		System.out.println("eating food...");
	}
	void run() {
		System.out.println("running.....");
	}
	void work(){
		super.eat();
		run();
	}
}
class TestSuper {
public static void main(String[] args) {
	Human h=new Human();
	h.work();
}
}
