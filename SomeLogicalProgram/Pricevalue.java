package RAJSONI;
import java.util.*;
public class Pricevalue {
public static void main(String[] args) {
	int n,v=500,c;
	System.out.println("The chair prize is 500 rupees");
	System.out.print("How many chairs would you want:- ");
	Scanner sc=new Scanner (System.in);
	n=sc.nextInt();
	c=n*v;
	System.out.println("the total prize is:- "+c+"rupees");
}
}
