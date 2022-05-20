//This demo is for singleton class
class A
{
    private static A obj=null;
    private A()
    {
        System.out.println("It can not be called from outside");
    }
    public static A getA()   //Factory Method
    {
    	if(obj==null)
		{
           	obj=new A();
		}
        return obj;
    }
}   //Class End
class Tester
{
    public static void main(String args[])
    {
        //A obj1=new A();  //CTE
        A x=A.getA();
        A y=A.getA();
        System.out.println(x==y);
    }
}   
