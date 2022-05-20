//this demo is jagged array
class JaggedDemo
{  
	public static void main(String[] args) 
	{
		int[][] arr=new int[3][];//3rows
		arr[0]=new int[5];
		arr[1]=new int[3];
		arr[2]=new int[2];
		System.out.println("the no.of rows are:"+arr.length);//3rows
		System.out.println("number of columns in each row\t"+arr[0].length+"\t"+arr[2].length);
	}
}
