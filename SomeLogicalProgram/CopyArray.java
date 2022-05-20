package RAJSONI;
public class CopyArray {
public static void main(String[] args) {
	int [] arr1= {30,40,50};
	int [] arr2= new int [arr1.length];
	for(int i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];
		System.out.print(arr2[i]+",");
	}
	
}
}
