package RAJSONI;

public class ArrayDemo1 {
public static void main(String[] args) {
	int[] arr= new int[] {10,20,30};
	System.out.println("Using basic For loop:-");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	System.out.println();
	System.out.println("USing Enhanced For Loop:-");
	for(int var:arr)
	{
		System.out.println(var);
	}
}
}
