package Lecture2;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int col = 1;
		int n = 4;
		boolean flag = true;
		while (row != 0) {
			col = 1;
			while (col <= n - row) {
				System.out.print(" ");
				col++;
			}
			int value = row;
			col = 1;
			while (col <= row) {
				System.out.print(value);
				value++;
				col++;
			}
			col = 1;
			value = value - 2;
			while (col < row) {
				System.out.print(value);
				value--;
				col++;
			}
			if (row == n) {
				flag = false;
			}

			if (flag) {
				row++;
			} else {
				row--;
			}
			System.out.println();
		}
	}

}
