package Lecture1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3489;
		while (n != 0) {
			int rem = n % 10;
			System.out.print(rem);
			n = n / 10;
		}
	}

}
