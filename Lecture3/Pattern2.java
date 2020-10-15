package Lecture3;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1;
		int col = 1;
		int decValues = 0;
		int value = 1;
		int len = 2 * n - 1;
		while (row <= 2 * n - 1) {
			int samevalues = len - (2 * decValues);
			value = n;
			col = 1;
			while (col <= decValues) {
				System.out.print(value);
				value--;
				col++;
			}
			col = 1;
			while (col <= samevalues) {
				System.out.print(value);
				col++;
			}
			col = 1;
			value++;
			while (col <= decValues) {
				System.out.print(value);
				value++;
				col++;
			}
			if (row < n) {
				decValues++;
			} else {
				decValues--;
			}
			System.out.println();
			row++;
		}
	}

}
