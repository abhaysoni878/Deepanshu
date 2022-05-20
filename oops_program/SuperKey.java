package Oops;

class Animals {
String colour="white";

}
class dogs extends Animals{
	String colour="black";
	void printcolour() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
class SuperKey extends dogs {
	public static void main(String[] args) {
		dogs d= new dogs();
		d.printcolour();
	}
}