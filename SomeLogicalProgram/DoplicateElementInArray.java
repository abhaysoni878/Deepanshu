package RAJSONI;
import java.util.*;
public class DoplicateElementInArray {
public void array() {

	int n;
	System.out.print("Enter the num in array:- ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
	int[] arr=new int [n];
	System.out.print("Enter the array:- ");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.print("Duplicate elements is in given array is:- ");
	for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[j]);
		}
	}
	}
}
public static void main(String[] args) {
	DoplicateElementInArray obb=new DoplicateElementInArray();
	obb.array();
}
}
