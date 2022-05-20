package Oops;
class bike{
	int speedlimit=90;
	/*void speed() {
		System.out.println(speedlimit);
	}*/
}

class RunTimepoly extends bike {
int speedlimit=150;
/*void speed() {
	System.out.println(speedlimit);
}*/

public static void main(String[] args) {
	bike obb=new RunTimepoly();
	//obb.speed();
	System.out.println(obb.speedlimit);
}
}

