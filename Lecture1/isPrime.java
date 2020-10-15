package Lecture1;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 171;
		int i = 2;
		while (i <= n - 1) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				return;
			}
			i++;
		}
		System.out.println("Prime");
	}

}
