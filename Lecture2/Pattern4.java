package Lecture2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int col = 1;
		int n = 5;
		while (row <= n) {
			col = 1;
			while (col <= row) {
				if (col == 1 || col == row) {
					System.out.print(row + " ");
				} else {
					System.out.print("0 ");
				}

				col++;
			}
			System.out.println();
			row++;
		}
	}

}
