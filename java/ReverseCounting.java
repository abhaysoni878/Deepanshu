package Abhay;

public class ReverseCounting {

	public static void main(String[] args) {
		String[] s1= {"Apple","Banana","orange","Lithchi","Mango"};
		String[] s2= {"red","Yellow","orange","pink","green"};
		int n=s1.length;
		int m=s2.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j)
				{
					System.out.println(s1[i]);
					System.out.println(s2[j]);
				}
				
			}
		}
		

	}

}
