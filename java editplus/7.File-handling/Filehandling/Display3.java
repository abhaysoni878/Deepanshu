import java.io.*;
class Display3
{
     public static void main(String args[])
      {
               try
               {
            FileInputStream in=new FileInputStream(args[0]);
              byte data[]=new byte[in.available()];
              in.read(data);
              String str=new String(data);   
                System.out.println(str);
                 }
                 catch(Exception e)
                 {
                      System.out.println(e);
                  }
        }
}