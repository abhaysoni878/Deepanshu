package Oops;
class TestSuper2 extends run {
public static void main(String[] args) {
	run r=new run();
}
}

class Program{
	Program(){
		System.out.println("program is created.");
	}
}
class run extends Program{
	run(){
		super();
		System.out.println("Program is running");
		
	}
	}
