package Abhay;

public class Primenumber {

	public static void main(String[] args) {
		int i,n=0;
		
		String k="";
		for(i=1;i<=100;i++)
		{
			int count=0;
			for(n=i;n>=1;n--)
			{
				
				if(i%n==0)
				{
					count=count+1;
				}
			}
				if(count==2)
				{
					k=k+ i + ",";
				}
		}
		System.out.println("This is the prime number are");
		System.out.println(k);
		// TODO Auto-generated method stub

	}

}
