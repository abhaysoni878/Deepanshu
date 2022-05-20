package RAJSONI;
import java.util.*;
public class Stringpositioninchar {
public static void main(String[] args) {
	String s;
	int i;
	char a;
	System.out.println("enter name:-");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	
	for( i=0;i<=s.length();i++){
		a=s.charAt(i);
		
	System.out.println(i  +"  position  "+a);	
	}	
}
}