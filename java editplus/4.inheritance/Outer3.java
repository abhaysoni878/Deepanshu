class  Outer3
{
	int x=10;
	static int y=20;
	void display()//Method
	{
	class Inner//Method Local inner class
	{
		public void show()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}//Method Local inner class end
	Inner i=new Inner();
	i.show();
	}//Method end
		public static void main(String args[]) 
	{
		Outer3 o=new Outer3();
		o.display();
		//System.out.println("Hello World!");
	}
}
