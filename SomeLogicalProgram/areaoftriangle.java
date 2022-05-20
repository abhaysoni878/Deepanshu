package RAJSONI;
import java.util.*;
public class areaoftriangle {
public static void main(String[] args) {
	double b,h,result;
	double half=0.5;
	Scanner sc=new Scanner(System.in);
	System.out.println("b:-");
	System.out.println("h:-");
	b=sc.nextDouble();
	
	h=sc.nextDouble();
	result=half*b*h;
	System.out.println(result);
}
}
