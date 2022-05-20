package Oops;
import java.util.Scanner;
public class SetGetFacbook {
	String id;
	String pass;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

public static void main(String[] args) {
	String id;
	String pass;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter id:- ");
	id=sc.nextLine();
	System.out.println("enter pass:- ");
	pass=sc.nextLine();
	
	SetGetFacbook obb=new SetGetFacbook();
	obb.setId(id);
	System.out.println(obb.getId());
	obb.setPass(pass);
	System.out.println(obb.getPass());
}
}
