package Oops;
	class a {
		void add(int a,int b) {
			System.out.println(a+b);
		}
	}
	class z extends a{
		 void add(int a, int b) {
			System.out.println(a-b);
		}
	}
	class InheritanceBAsic {
	public static void main(String[] args) {
		a obb= (a) new a();
		obb.add(10, 10);
		
	}
	}
