package Lecture3;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int tot_spaces = 0;
		int numstars = n;
		int row = 1;
		while (row <= 2 * n - 1) {
			int spaces = 1;
			while (spaces <= tot_spaces) {
				System.out.print(" ");
				spaces++;
			}
			int stars = 1;
			while (stars <= numstars) {
				System.out.print("*");
				stars++;
			}
			if (row < n) {
				tot_spaces = tot_spaces + 2;
				numstars--;
			} else {
				tot_spaces = tot_spaces - 2;
				numstars++;
			}
			System.out.println();
			row++;
		}
	}

}
