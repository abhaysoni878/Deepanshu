package Oops;

public class DisplayOverloading {
 void disp(char c) {
	System.out.println(c);
}
 void disp(char c,int n) {
	System.out.println(c+" "+n);
}

public static void main(String[] args) {
DisplayOverloading obb=new DisplayOverloading();
obb.disp('z');
obb.disp('z', 10);
}
}
