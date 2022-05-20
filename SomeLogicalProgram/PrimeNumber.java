package RAJSONI;
import java.util.*;
public class PrimeNumber {
public static void main(String[] args) {
	int i;
	int n,m=0;
	int flag=0;
	//boolean flag=false;
	System.out.print("enter the number:- ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=n/2;
	if(m==0&&m==1) {
		System.out.println(n+" is not a prime number");
		}
	else {
		for(i=2;i<=n/2;i++) {
			if (n%i==0) {
				System.out.println(n+" is not a prime number");
				flag=1;
				//flag=true;
				break;
			}
		}
		}
	if(flag==0) {
	//if(flag==false) {
	System.out.println(n+" is a prime number");
	}	
	}
}