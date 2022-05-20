class Box
{ 
private int length,breadth,height;
public void Setvariable(int l,int b,int h)
{length=l;breadth=b;height=h; }
public void SetDimension()
{System.out.println("length="+l);
System.out.println("breadth="+b);
System.out.println("height="+h);}}
class Example extends Box
{
public static void main()
{Box smallBox=new Box();
smallBox.SetDimension(12,10,5);}} 