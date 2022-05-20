import java.util.Scanner;
import java.lang.*;
class kallu
{
  public static void main(String args[])
  {
    int ascii[]={0};
    int i,count=0;
    //s=new String[i];
    Scanner sc=new Scanner(System.in);
    //String[] s=new String[i];

	String s=sc.next();
    int l=s.length();
    for(i=0;i<l;i++)
       ascii[s.charAt(i)-'a']++;
    for(i=0;i<26;i++)
      if(ascii[i]==1)
        count++;
    //Try out your code here
    System.out.println(+count);
  }
}