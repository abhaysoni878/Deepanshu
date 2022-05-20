class  PromDemo1
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(long a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		PromDemo1 pd=new PromDemo1();
		pd.sum(20,10);//now ambiguity/CTE
		//System.out.println("Hello World!");
	}
}
