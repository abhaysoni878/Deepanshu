import java.util.*;
class  Rev
{
	public static void main(String[] args) 
	{
		int result=0;
		int n,remender;
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
		while(n>0){
        remender=n%10;
		result=result*10+remender;
		n=n/10;
	}
	System.out.println(result);
	}
}
