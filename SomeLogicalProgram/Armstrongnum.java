package RAJSONI;
import java.util.*;
public class Armstrongnum {
	public static void main(String[] args) {
		
		int n,a,sum=0,result;
		
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		result=n;
		while (n>0) {
			a=n%10;
			sum=sum+(a*a*a);
			n=n/10;
			
		}
		if (sum==result) {
		System.out.println( sum+ "is a armstrong number");
	}
		else {
		System.out.println(sum+  "is not a armstrong number");	
		}
}}
