//This demo is for constructor chaining 
class Parent
{
        Parent()
        {
                  //this(); //It calls  the Object class Constructor
                  System.out.println("I am Parent constructor");
        }
}
class Child6 extends Parent
{
         Child6()
         {
			          //this();  //parent class cosntructor
                      System.out.println("I am child class constructor");
         }

          public static void main(String[] args)
          {
                   Child6 obj=new Child6();
          }
}
 