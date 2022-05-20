class Rectangle 
{
	private int l,b;

	public void display()
	{
		System.out.println("Length= "   +l);
		System.out.println("Breadth= "   +b);
	}
	public int area()
	{
		return l*b;
	}
	public void setDimension(int x,int y)
	{
		l=x;
		b=y;
	}
}
class RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		//r.l=7;//CTE
		r.setDimension(7,8);//method call
		System.out.println("Dimension of Rectangle r");
		r.display();
		System.out.println("Area of rectangle r is "    +r.area());
	}
}