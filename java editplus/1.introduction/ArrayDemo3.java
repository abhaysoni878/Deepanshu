//this demo is for multi-dimensional arrray
class  ArrayDemo3
{
	public static void main(String[] args) 
	{
		//declare and create two dimensional array whose size is 3 by 5.
		int[][] arr=new int[3][5];
		System.out.println("number of rows"+arr.length);
		System.out.println("number of column in first Row=" +arr[0].length);//5
		System.out.println("number is column in second row"+arr[1].length);//5
		//display the value of each entry in the array.
		for(int i=0;i<3;i++)
		{

		System.out.print("\n starting row"+i);
		for(int j=0;j<5;j++)
			{
			arr[i][j]=i*j;
		System.out.print(arr[i][j]+"\t\t");
		}}}}
