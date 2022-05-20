package abhay;
import java.util.*;
public class Secondlargestwithoutsort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int num[]={1,9,5,55,8,-1,3,55};
	    int n=num.length;
	    int highest=Integer.MIN_VALUE;
	    int secondHighest=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++)
	    {
	        if(num[i]>highest)
	        {
	            secondHighest=highest;
	            highest=num[i];
	        }
	        if(num[i]<highest && num[i]>secondHighest)
	        {
	            secondHighest=num[i];
	        }
	    }
		System.out.println("Second highest elemnet are"+secondHighest);
	}
}