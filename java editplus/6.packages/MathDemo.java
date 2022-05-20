//this Demo is for math class
import java.lang.*;//This is Optional
class MathDemo 
{
	public static void main(String[] args) 
	{
		int val=-5,absVal;
		absVal =Math.abs(val);
	System.out.println("the absolute value of -5 is"+absVal);

		double val1=9.0,ceilVal1;
		double val2=3.2,ceilVal2;
		double val3=-7.3,ceilVal3;
		ceilVal1=Math.ceil(val1);//9.0
		ceilVal2=Math.ceil(val2);//4.0
		ceilVal3=Math.ceil(val3);//-7.0

		double floorVal4=Math.floor(val1);
		double floorVal5=Math.floor(val2);
		double floorVal6=Math.floor(val3);
	System.out.println("all ceiling value are as follow");
	System.out.println(ceilVal1);
	System.out.println(ceilVal2);
	System.out.println(ceilVal3);
	System.out.println("All floor values are as follows");
	System.out.println(floorVal4);
	System.out.println(floorVal5);
	System.out.println(floorVal6);
		
		int val4=19,val5=54,minVal,maxVal;
		minVal=Math.min(val4,val5);//19
		maxVal=Math.max(val4,val5);//54
	System.out.println("The minimum value is "+minVal);
	System.out.println("The maximum value is "+maxVal);

		int res=Math.round(9.5f);
	System.out.println("the round value of 9.5 is"+res);

		long res1=Math.round(9.5);
	System.out.println("the round value of 9.5 is "+res1);
	System.out.println("the square root of 5 is "+Math.sqrt(5));
	}
}
