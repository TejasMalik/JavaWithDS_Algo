package Lecture1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int counter = 1;
		int a = 0, b = 1;
		while (counter <= n + 1) {
			System.out.print(a + "\t");
			int c = a + b;
			a = b;
			b = c;
			counter++;
		}
	}

}
