package RAJSONI;
import java.util.*;
public class Factorial {
 public static void main(String[] args) {
	int fact;
	int num=1;
	Scanner sc=new Scanner(System.in);
	fact=sc.nextInt();
	
	while(fact>0) {

	num=num*fact;
	fact--;
 }
	System.out.println(num);


 }


 }
