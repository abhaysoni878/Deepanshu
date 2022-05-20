class BoxingDemo1
{
  public static void main(String[] args)
  {
	int a=50;

        Integer a2=new Integer(a);  //Boxing
        Integer a3=a;                          //AutoBoxing
      
        System.out.print(a2+"\t"+a3);
 } 
} 