package Lecture1;

public class PrintPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int num = 2;
		while (num <= 50) {
			// i need to know number is prime or not
			int factor = 0;
			int divisor = 2;
			while (divisor <= num - 1) {
				if (num % divisor == 0) {
					factor = 1;
					break;
				}
				divisor++;
			}
			if (factor == 0) {
				System.out.println(num);
			}
			num++;
		}
	}

}
