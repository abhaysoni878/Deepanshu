import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      String s=sc.next();
    int[] i;
    int[] j;int count=0;
    int[] k=new s.length();
    for(i=0,j=k-1;i<k;i++,j++)
    {
      if(s[i]==s[j])
        count++;
    }
      //Try out your code here
    System.out.println(+count);
  }
}