import java.io.*;
class SaveDemo
{  

 public static void main(String args[])throws Exception
 {  
    Student s1=new Student(100,"Rajat");  
    FileOutputStream fout=new FileOutputStream("f.txt"); 
	ObjectOutputStream out=new ObjectOutputStream(fout);  
    out.writeObject(s1);  
    out.flush();  
  System.out.println("Serialization is done succesfully");  
 }  
}  
