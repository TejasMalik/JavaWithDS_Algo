package Lecture4;

public class FunWithFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HelloFun();
		// HelloFun();

		// HelloFun();
		// HelloGun();
		// int si = 10;
		// System.out.println(printName(si));
		// System.out.println(si);

		int a = 10, b = 20;
		System.out.println(a);
		System.out.println(b);
		swap(a, b);
		System.out.println(a);
		System.out.println(b);

	}

	public static void HelloFun() {
		System.out.println("HelloFun");
	}

	public static void HelloGun() {
		HelloFun();
		System.out.println("HelloGun");
	}

	public static int printName(int a) {
		a = 30;
		return a;

	}

	// public static void scopes(int a){
	// a=30;
	// if(a==30){
	// int b=40;
	// System.out.println(a);
	// System.out.println(b);
	// }
	// System.out.println(a);
	// System.out.println(b);
	// }

	public static void swap(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}

}
