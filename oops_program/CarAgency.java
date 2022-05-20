package Oops;

public class CarAgency {
	public static void main(String[] args) {
	agency obb=new agency();
	System.out.println(obb.arr[2]);
	}
}
class agency extends CarAgency{
static	String[] arr={"bmw","audy","jaguar","bens"};
}
