class ArrayDemo2
{
public static void main(String[] args)
{
//declare and create int array whose size is 10
int[] arr=new int[10];
arr[0]=10;
arr[1]=20;
arr[9]=30;
//display the value of each entry in the array.
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+"\t");
}}}