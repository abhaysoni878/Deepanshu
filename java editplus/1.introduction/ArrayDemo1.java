class ArrayDemo1
{
public static void main(String[] args)
{
	int[] arr=new int[]{10,20,30};
//int[] arr={10,20,30};
System.out.println("using basic for loop");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+"\t");
}
System.out.println();
System.out.println("using enhanced for loop");
for(int var:arr)
{
System.out.println(var);
}}}