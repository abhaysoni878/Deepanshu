package Oops;

public class ChangingValue {
	 int n=50;
	void display(ChangingValue ch) {
		n=n+20;
	}
	public static void main(String[] args) {
		ChangingValue ch=new ChangingValue();
		System.out.println("before "+ch.n);
		ch.display(ch);
		System.out.println("after"+ch.n);
	}
}

    