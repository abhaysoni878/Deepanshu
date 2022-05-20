package RAJSONI;
import java.util.*;
public class BankingSystem {
public static void main(String[] args) {
	int balance=50000;
	int widraw;
	System.out.print("Enter widraw ammount:- ");
	Scanner sc=new Scanner(System.in);
	widraw = sc.nextInt();
	if(widraw>balance) {
		System.out.println("you did not have sufficient ammont in your bank account.");
	}
	else {
		balance=balance-widraw;
		System.out.println("your balance is:- "+balance);
		System.out.println("transaction succfully.");
	}
	
	System.out.println("thankyou");
}
}
