package abhay;
import java.util.*;
import java.util.Scanner;
public class Secondlargest1 {

	public static void main(String[] args) {
		System.out.println("Howmany numbers of arrays print");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int arr[]=new int[t];
		int n=arr.length;
		Arrayof(arr,n);
	}
	public static void Arrayof(int arr[],int arr_size)
	{
		if(arr_size<2)
		{
			System.out.print("Not find second largest element");
			return;
		}
		int first,second,i;
		int largest=second=Integer.MIN_VALUE;
		for(i=1;i<=arr_size;i++)
		{
			largest =Math.max(largest,arr[i]);
		}
		for(i=1;i<=arr_size;i++)
		{
			if(arr[i]!=largest)
			{
				second=Math.max(second,arr[i]);
			}
		}
			if(second==Integer.MIN_VALUE)
			{
				System.out.printf("There are no second "+"Largest element is %d\n",second);
			}
			else
			{
				System.out.printf("The second largest "+"element is %d\n",second);
			}		
	}
}