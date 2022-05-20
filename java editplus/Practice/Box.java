class Box
{
	private int length,breadth,height;
	public void setdimension(int l,int b,int h)
	{
		length= l;
		breadth= b;
		height= h;
	}
	public void showdimension()
	{
		System.out.println("length="+length);
		System.out.println("breadth="+breadth);
		System.out.println("height="+height);
	}
}
class Example
{
	public static void main(String[] args)
	{
		Box.smallBox=new Box();
		smallBox.setdimension(12,5,8);
		System.out.println(smallBox.showdimension);
	}
}