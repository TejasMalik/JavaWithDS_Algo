package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int col = 1;
		int n = 5;
		while (row <= n) {
			col=1;
			while(col<=n){
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
