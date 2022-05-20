package RAJSONI;
import java.util.*;
public class Revrsenum {
public static void main(String[] args) {
	int result=0;
	int remender,n;
	System.out.println("n:-");
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	while (n>0) {
	remender=n%10;
	result=result*10+remender;
	n=n/10;
	}
	
	System.out.println(result);
	
	
	
}}
