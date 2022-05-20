//package RAJSONI;

import java.util.*;
 class ZigZagArray {
	 static int[] arr= {1,2,3,4,5,6,7};
static void zigzag() {
	
	boolean flag=true;
	int temp=0;
	for(int i=0;i<=arr.length-2;i++) {
		if(flag)
		{
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}	
		}
		else {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		flag=!flag;
	}
}
public static void main(String[] args) {
	
      zigzag();
	System.out.println(Arrays.toString(arr));
}
}