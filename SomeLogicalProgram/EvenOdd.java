package RAJSONI;
//import java.util.*;
public class EvenOdd {
	public static void evenodd(int n) {
		int m;
	//	System.out.print("Enter the number:- ");
		//Scanner sc=new Scanner (System.in);
	//	n=sc.nextInt();
		m=n%2;
		if (m==0) {
			System.out.println(n+" is even.");
		}
		else {
			System.out.println(n+" is odd.");
		}
	}
public static void main(String[] args) {
	//EvenOdd obb= new EvenOdd();
	//obb.evenodd();
	evenodd(7);
}
}
