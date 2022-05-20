import java.io.Serializable;
  
public class Student implements Serializable
{  
 int id;  
 String name;   //These are the instance variable

 public Student(int id, String name)
 {  
  this.id = id;  
  this.name = name;  
 }  
}  
