package RAJSONI;
public class LargestnumInarray {
	public static void main(String[] args)
	{
		int [] arr= {69,7678,8,896,89879};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) 
				max=arr[i];
		}
			System.out.println(max);
		}
}
