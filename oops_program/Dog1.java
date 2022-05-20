package Oops;

class Dog1 {
void bark() {
	System.out.println("dog is barking.....");
}
}
class Dog2 extends Dog1 {
	void eat() {
		System.out.println("dog is eating.....");
	}
}
class Dog3 extends Dog2 {
	void run() {
		System.out.println("dog is running.....");
	}
}