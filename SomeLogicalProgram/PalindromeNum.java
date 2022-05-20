package RAJSONI;
import java.util.*;
public class PalindromeNum {
public static void main(String[] args) {
	int num;
System.out.print("enter the number:- ");
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
	int remainder,n,result=0;
	 n=num;

	while(num>0) {
		remainder=num%10;
		result=result*10+remainder;
		num=num/10;
		
	}
	if(result==n) {
		System.out.println(n+" "+"this is palindrome number.");
	}
	else {
		System.out.println(n+" "+ "this is not palindrome number.");
	}
	
}
}
