//this Demo is for static variable and static method
class StaticDemo
{
      String name;
      int age;                    //these are the instance variable
     static String cname="Infomatics";   //class variable
     void disp()
     {
          System.out.println("Name is "+name);
          System.out.println("Age is "+age); 
          System.out.println("The Center name is "+cname);
          System.out.println();   //for a blank line
     }
    public static void main(String args[])
     {
                  StaticDemo st1=new StaticDemo();
                  st1.name="DD";
                  st1.age=32;

                  StaticDemo st2=new StaticDemo();
                  st2.name="Dev";
                  st2.age=2;
          
                 st1.disp();
                 st2.disp();
         
          }
} 