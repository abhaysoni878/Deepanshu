class  Calculation
{
	int sum   (int num1,int num2)
	{
		return num1+num2;
	}
	double sum  (int num1,int num2)
	{
		return num1+num2;
	}
	public static void main(String...args) 
	{
		Calculation obj=new Calculation();
		double result=obj.sum(10,20);
	}
}
