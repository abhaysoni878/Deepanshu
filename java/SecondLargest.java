package abhay;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args)
	{
		int[] arr= {5,1,5,4,3,2,4,1};
		int n=arr.length;
		Numberof(arr,n);
	}
	public static void Numberof(int arr[],int arr_size)
	{
		int i,n;
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		if(arr_size<2)
		{
			System.out.print("it is not find second largest");
			return;
		}
		for(i=arr_size-2;i>=0;i--)
		{
			if(arr[i]!=arr[arr_size-1])
			{
				System.out.printf("\n%d",arr[i]);
				return;
			}
		}
	}

}
